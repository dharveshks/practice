package com.Adactin;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;

	public static WebDriver chl(String type) {

		if (type.equalsIgnoreCase("chrm")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ramya\\eclipse-workspace\\Selenium_Testing\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		return driver;
	}

	public static void oii(String cod) {

		driver.get(cod);
	}

	public static void cls(WebElement element) {
		element.click();

	}

	public static void sd(WebElement element, String val) {

		element.sendKeys(val);
	}

	public static void frm(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void cos() {
		driver.close();
	}

	public static void getcurrenturl() {
		driver.getCurrentUrl();

	}

	public static void selectbyvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectbyvisibletext(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

}

