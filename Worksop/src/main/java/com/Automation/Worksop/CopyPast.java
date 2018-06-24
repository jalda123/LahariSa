package com.Automation.Worksop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyPast {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys(Keys.CONTROL.ENTER);
		
		//driver.findElement(By.id("emial")).sendKeys(Keys.CONTROL.RETURN);
		
		//refresh the browser
		Thread.sleep(2000);
		
		//driver.findElement(By.id("email")).sendKeys(Keys.F5);
		
	String name =	driver.findElement(By.id("email")).getAttribute("value");
	
	System.out.println(name);
		
		Thread.sleep(3000);

		
		//driver.manage().window().setPosition(new Point(0,-1000));
		
	//	Thread.sleep(3000);

	}

}
