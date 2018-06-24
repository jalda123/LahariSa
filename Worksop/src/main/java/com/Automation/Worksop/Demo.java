package com.Automation.Worksop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		Utility1.capturescreenshot(driver, "Facebook1");
		
		
		
		

	}

}
