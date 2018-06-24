package com.Automation.Worksop;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	
	
	public static void captureScreenshot(WebDriver driver,String screenshotname)  {
		
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			
			File src =ts.getScreenshotAs(OutputType.FILE);
			
		//	FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"/Screenshot/"+screenshotname+".jpg"));
			
			//FileUtils.copyFile(src, new File("./Screenshot/"+screenshotname+".png"));
			
			File dest = new File("./Screenshots/amazon.png");
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			
		
	}

	}
	
}
