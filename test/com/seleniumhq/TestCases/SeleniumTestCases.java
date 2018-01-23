package com.seleniumhq.TestCases;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SeleniumTestCases {
	String driverType;
		
	
  @Test
  public void HomePage() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass(@Optional("") String browser) {
	  try{
			driverType = browser;
			//need to add code to read excel
			
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
