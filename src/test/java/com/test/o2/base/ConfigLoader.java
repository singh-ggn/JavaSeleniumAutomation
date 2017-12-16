package com.test.o2.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	Properties config = null;

	public void onLoad() {
		
		FileInputStream fs;
		try {
			config = new Properties();
			fs = new FileInputStream(System.getProperty("user.dir")
					+ WebConnectorConstants.CONFIG_PROPERTIES);
			config.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//throw new FileNotFoundException();
		} catch (IOException e) {
			e.printStackTrace();
			//throw new IOException();
		}
	}
}
