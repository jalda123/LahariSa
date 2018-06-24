package com.Automation.Worksop;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility1 {
	
	public static  void capturescreenshot(WebDriver driver, String screenshotname) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("./Screenshot1/"+screenshotname+".png"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
