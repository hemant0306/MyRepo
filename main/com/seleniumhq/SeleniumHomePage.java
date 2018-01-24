package com.seleniumhq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.common.CommonFunctions;

public class SeleniumHomePage {
	private WebDriver driver;
	private CommonFunctions CommonFunction = new CommonFunctions();
	public SeleniumHomePage(WebDriver GDriver)
	{
		driver = GDriver;
	}

	//Objects

	private String txtSelenium 	 		= "//a[contains(text(),'Browser Automation')]";
	private String btnProject 	  		= "//*[@title='Selenium Projects']";
	private String btnDownload 			= "//*[@title='Get Selenium']";


	public boolean SeleniumPageDisplayed(){

		WebElement txtSeleniumhq= driver.findElement(By.xpath(txtSelenium));
		if(CommonFunction.fcommonObjectFound(txtSeleniumhq))
		{
			return true;
		}
		return false;
	}

	public boolean ClickOnProject(){

		WebElement txtSeleniumhq= driver.findElement(By.xpath(btnProject));
		if(CommonFunction.fcommonClick(txtSeleniumhq))
		{
			return true;
		}
		return false;
	}

	public boolean ClickOnDownloads(){

		WebElement txtSeleniumhq= driver.findElement(By.xpath(btnDownload));
		if(CommonFunction.fcommonClick(txtSeleniumhq))
		{
			return true;
		}
		return false;
	}


}
