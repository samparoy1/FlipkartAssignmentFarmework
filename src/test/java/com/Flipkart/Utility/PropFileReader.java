package com.Flipkart.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFileReader {

	
	public Properties getProperty() {
		
		Properties pro = new Properties();
		
		try {
			pro.load(new FileInputStream("config/browser-config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e);
		}
		
		return pro;
		
		
	}
	
}
