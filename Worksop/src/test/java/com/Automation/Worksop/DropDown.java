package com.Automation.Worksop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement daydrop = driver.findElement(By.id("day"));
		
		Select sel = new Select(daydrop);
		
		WebElement ele =sel.getFirstSelectedOption();
		System.out.println("FirstSelected Option is"+ele);
		
		List<WebElement> all =sel.getOptions();
		
		int count =all.size();
		System.out.println(count);
		sel.selectByIndex(1);
		
		for(int i =0;i<count;i++) {
			Thread.sleep(3000);
			
			String value = all.get(i).getText();
			
			System.out.println(value);
			
			sel.selectByIndex(i);
		}

	}

}
