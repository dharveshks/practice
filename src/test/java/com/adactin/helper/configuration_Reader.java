

package com.adactin.helper;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configuration_Reader {

	public static Properties p = new Properties();

	public configuration_Reader() throws IOException {
		File g = new File(
				"C:\\Users\\Siva\\eclipse-workspace\\mainpro\\src\\test\\java\\com\\adactin\\helper\\Configuration.properties");

		FileInputStream as = new FileInputStream(g);

		p.load(as);

	}

	public String get_Browser() {

		String browser = p.getProperty("browser");
		return browser;

	}

	public String get_url() {
		String url = p.getProperty("url");
		return url;

	}
	

	public String get_cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;

	}

	public String get_Credit() {
		String Credit = p.getProperty("Credit");
		return Credit;

	}
}
