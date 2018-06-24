package com.Automation.Worksop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Software\\geckodriver-v0.20.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
