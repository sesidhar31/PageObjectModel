package com.crm.qa.util;

import com.crm.qa.Base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT =30;
	public static long IMPLICIT_WAIT=20;
	//these two variables are creating for when application is very slow we can change it here 
	//these are used in Base class for pagload and implicit methods
	//created long variables because both methods accepts only long type as method parameters
	//we can config these variables in config.properties file also
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	
	
	
}
