
package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
		
	}
	
	public static  FileReaderManager getInstance() {
		FileReaderManager helper= new FileReaderManager();
				return helper;
		

	}
	
	
	public static configuration_Reader getinstanceCR() throws IOException {
		configuration_Reader reader= new configuration_Reader();
				return reader;
				
				
		
	}
}
