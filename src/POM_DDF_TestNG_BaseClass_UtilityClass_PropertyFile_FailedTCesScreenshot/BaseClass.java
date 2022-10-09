package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCesScreenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void initilizeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //add this wait compulsory
		driver.get( utilityClass.getPFData("URL"));
		
	}
	

}
