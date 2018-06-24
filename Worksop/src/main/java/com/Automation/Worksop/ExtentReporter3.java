package com.Automation.Worksop;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporter3 {
	
	WebDriver driver;
	
	ExtentReports extent;
	
	ExtentTest logger;
	
	@BeforeTest
	
	public void extentreporter() {
		
		ExtentHtmlReporter  reporter = new ExtentHtmlReporter("./Reports/Automation-learn.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		logger =extent.createTest("LoginTest");
		
		
		
	}
	
	@AfterTest
	
	public void tearDown(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			String pathscreen = Utility3.getscreenshot(driver);
			
			//logger.fail("details", MediaEntityBuilder.createScreenCaptureFromPath(pathscreen).build());
			
			/*MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(pathscreen).build();
			logger.fail("details", mediaModel);	
*/
			logger.fail("details").addScreenCaptureFromPath(pathscreen);

			
		}
		
		extent.flush();
		
		driver.quit();
	}
	
	@Test
	
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Assert.assertTrue(driver.getTitle().contains("sateesh"));
	
	}

}
