package com.adactin.propertry;

import com.adactin.helper.ConfigurationReader;

public class FileReader_Manager {
	
	private FileReader_Manager() { 
			
	}
	
	public static FileReader_Manager getinstance() {
		FileReader_Manager helper = new FileReader_Manager();
		return helper;

	}
	public ConfigurationReader getInstanceCR() throws Throwable {
		ConfigurationReader reader = new ConfigurationReader();
		return reader;

	}

}
