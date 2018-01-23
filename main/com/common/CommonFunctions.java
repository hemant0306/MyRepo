package com.common;

import org.openqa.selenium.WebElement;

public class CommonFunctions {
	//used to check whether 
	public boolean fcommonObjectFound(WebElement webElement)
	{
		if(webElement.isDisplayed())
		{
			return true;
		}
		return true;
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
