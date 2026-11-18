package com.demowebshop.generic_utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class javaUtility {
	
	public String getTimeStamp() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		
	}
	public int getrandomNumber() {
		return new Random().nextInt(100000);
	}
}
