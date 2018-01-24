package com.seleniumhq.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.common.CommonFunctions;
import com.seleniumhq.SeleniumHomePage;

public class SeleniumTestCases {
	WebDriver driver = null;
	String driverType;
	CommonFunctions comFunctions  = new CommonFunctions();

	@BeforeMethod
	@Parameters({"browser"})
	public void beforeMethod(@Optional("") String browser) {
		try {
			driver	   =	comFunctions.GetDriver(browser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Test
	public void CheckSeleniumPageContent() {

		driver.get("http://www.seleniumhq.org/");

		com.seleniumhq.SeleniumHomePage seleniumPage = new SeleniumHomePage(driver);
		Assert.assertTrue(seleniumPage.SeleniumPageDisplayed());


	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

	@BeforeClass
	@Parameters({"browser"})
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
