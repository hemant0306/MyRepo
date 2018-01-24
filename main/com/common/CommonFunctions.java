package com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {
	
	
	//used to check whether 
	public WebDriver GetDriver(String strDriver) {
		WebDriver driver=null;
		if(strDriver.isEmpty())
		{
			System.out.println("Enter Browser Name");
			return null;
		}
		if(strDriver.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ATT\\TestProject\\exe\\chromedriver.exe");

			// Initialize browser
			driver=new ChromeDriver();
		}
		return driver;		
	}
	
	
	public boolean fcommonObjectFound(WebElement webElement)
	{
		if(webElement.isDisplayed())
		{
			return true;
		}
		return false;
	}
	//used to click the object
	public boolean fcommonClick(WebElement webElement)
	{
		boolean strObjectPresent = fcommonObjectFound(webElement);

		if(strObjectPresent)
		{
			try {
				webElement.click();
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
		}
		System.out.println("Object Not Found");
		return false;
	}
}
