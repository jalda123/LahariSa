package com.Automation.Worksop;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility3 {
	
	public  static String  getscreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String dest ="./Screenshot/gmail.png";
		
		File destination = new File(dest);
		
		FileUtils.copyFile(src, destination);
		
		return dest;
	}

}
