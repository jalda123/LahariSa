package com.Automation.Worksop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FaildScreenshot {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
		try {
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("jaj")).click();
			
		}
		catch(Exception e) {
			
			Utility1.capturescreenshot(driver, "Facebook2");

			//System.out.println(e.getMessage());
		}

	}

}
