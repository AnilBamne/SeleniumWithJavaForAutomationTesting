package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	
	public void initilizeBrowser()
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //add this wait compulsory
		driver.get("https://kite.zerodha.com/");
		
	}
	

}
