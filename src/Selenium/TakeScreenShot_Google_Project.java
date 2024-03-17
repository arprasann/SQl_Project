package Selenium;



import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TakeScreenShot_Google_Project extends TestListenerAdapter
{

	
	public void onTestFailure(ITestResult tr)	
{
	
//Which Class need to TakeScreenshot
	File scrFile = ((TakesScreenshot)Google.driver).
			getScreenshotAs(OutputType.FILE);
	
//Where should be store Screnshot whenver Fail	
	FileUtils.copyFile(scrFile, new File("e:\\Google_Project\\"+tr.getName()+".png"));	
}
}
