package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //add this wait compulsory
		
		driver.get("https://kite.zerodha.com/");
		
//		------------- calling methods of class1 --------------
		
		KiteLogin1Page1 login1=new KiteLogin1Page1(driver);
//		login1.enterUID();
//		login1.enterPWD();
//		login1.clickOnLoginBtn();
		
		
		login1.inputKiteLogin1PageUID();
		login1.inputKiteLogin1PagePWD();
		login1.clickOnKiteLogin1PageLoginBtn();
		
//		-----------calling metods of class2 ----------
		
		KiteLogin2Page1 login2=new KiteLogin2Page1(driver);
//		login2.enterPin();
//		login2.clickOnContinueBtn();
		
		login2.inputKiteLogin2PagePin();
		login2.clickOnKiteLogin2PageContinueBtn();
		
//		----------calling methods of class3 --------------
		
		KiteHomePage1 home=new KiteHomePage1(driver);
	//	home.VerifyUserID();
		
		home.VerifyKiteHomePageUserID();
		
		
		Thread.sleep(2000);
		driver.quit();
		
		 
		
		
		
	}

}
