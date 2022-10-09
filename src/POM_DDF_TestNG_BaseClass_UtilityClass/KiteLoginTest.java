package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends BaseClass
{
	
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		 initilizeBrowser();
		 login1=new KiteLogin1Page(driver);
		 login2=new KiteLogin2Page(driver);
		 home=new KiteHomePage(driver);
	}


	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException 
	{
		login1.inpKiteLogin1PageUserid(utilityClass.getTestData(0, 0));
		login1.inpKiteLogin1PagePassword(utilityClass.getTestData(0, 1));
		login1.clickKiteLogin1PageLoginbtn();
		
		login2.inpKiteLogin2PagePin(utilityClass.getTestData(0, 2));
		login2.clickKiteLogin2PageContBtn();
		 
	}


	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException 
	{
		String actUid = home.getKiteHomePageActUserID();
		String expeUid = utilityClass.getTestData(0, 3);
		
		Assert.assertEquals(actUid, expeUid);
	}


	@AfterMethod
	public void logout() 
	{
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
		
	}

}
