package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {

		//1-Create a object of File class and Handle FileInputStreamException
		File file=new File("C:\\Users\\ASUS SSD\\Documents\\Sample.properties");
		
		//2-Create object for FileInputStream
		FileInputStream fis=new FileInputStream(file);
		
		//3-Create object of FileInputStram and Handle IOException
		Properties property=new Properties();
		
		//4-Call load() to load the FIS in the Properties Object
		property.load(fis);
		
		//5-Read the values using key from the properties file
		String writtenbrowser = property.getProperty("browser");
		String url = property.getProperty("applicationUrl");
		System.out.println(writtenbrowser);
		System.out.println(url);
		
	}

}
