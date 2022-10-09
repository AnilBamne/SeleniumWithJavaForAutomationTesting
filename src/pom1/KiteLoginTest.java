package pom1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\FrameworkData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //add this wait compulsory
		
		driver.get("https://kite.zerodha.com/");
		
//	--------------------------------------------------
		
		KiteLogiun1Page login1=new KiteLogiun1Page(driver);  //input values from excel sheet
		
		String uid = sh.getRow(0).getCell(0).getStringCellValue();
		login1.inpKiteLogiun1PageUsername(uid);
		
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		login1.inpKiteLogiun1Pagepassword(pwd);
		
		login1.clickKiteLogiun1PageLoginBtn();
		
		
//		------------------------------------
		
		KiteLogiun2Page login2=new KiteLogiun2Page(driver);
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		login2.inpKiteLogiun2Pagepin(pin);
		
		login2.clickKiteLogiun2Pagecntbtn();
		
//		-----------------------------------------------
		
		KiteHomePage home=new KiteHomePage(driver);
		
		String expuid = sh.getRow(0).getCell(3).getStringCellValue();
		home.verifyKiteHomePageuid(expuid);
				
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}
	
	
	
	
	

}
