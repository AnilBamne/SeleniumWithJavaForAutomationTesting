package POM_DDF_testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 
public class KiteLoginTest
{
	FileInputStream file;
	Sheet sh;
	WebDriver driver;
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
		file = new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\FrameworkData.xlsx");
		sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //add this wait compulsory
		
		driver.get("https://kite.zerodha.com/");
		
		login1=new KiteLogin1Page(driver);  //input values from excel sheet
		login2=new KiteLogin2Page(driver);
		home=new KiteHomePage(driver);
		 
		
		
		
	}
	
	@BeforeMethod
	public void LoginToApp() 
	{
		
		login1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLogin1PageLoginBtn();
		
		
		login2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickKiteLogin2PageContBtn();
		
	}
	
	@Test
	 public void verifyUserID() 
	{
		String actUID=home.getKiteHomePageActualUid();
		String expUID=sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(actUID, expUID,"Failed-both results are diff:  ");
	}
	
	@AfterMethod
	public void Logout() 
	{
		//log out
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	

}
