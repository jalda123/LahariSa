package com.Automation.Worksop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FacebookScreenshot{
	
WebDriver driver;
	
	@Test
	
	public void Captu() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Software\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@id='emai']"));
			
	}
	
	@AfterMethod
	
	public void tearDown(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			Utility.captureScreenshot(driver, result.getName());
		}
		
	}

}
