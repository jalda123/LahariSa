package com.Automation.Worksop;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://artoftesting.com/interviewSection/selenium-interview-questions-part3.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.confirm('Do You Agree');");
	}

}
