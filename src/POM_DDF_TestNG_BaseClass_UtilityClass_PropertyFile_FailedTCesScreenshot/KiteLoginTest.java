package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCesScreenshot;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends BaseClass {

	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	KiteOrderPage order;
	int TCID;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		initilizeBrowser();
		login1 = new KiteLogin1Page(driver);
		login2 = new KiteLogin2Page(driver);
		home = new KiteHomePage(driver);
		order = new KiteOrderPage(driver);
	}

	@Test
	public void loginToKite() throws EncryptedDocumentException, IOException {
		login1.inpKiteLogin1PageUserid(utilityClass.getPFData("UN"));
		login1.inpKiteLogin1PagePassword(utilityClass.getPFData("PWD"));
		login1.clickKiteLogin1PageLoginbtn();

		login2.inpKiteLogin2PagePin(utilityClass.getPFData("PIN"));
		login2.clickKiteLogin2PageContBtn();

	}

	@Test(priority = 5)
	public void verifyUserID() throws EncryptedDocumentException, IOException {
		TCID = 101;
		String actUid = home.getKiteHomePageActUserID();
		String expeUid = utilityClass.getTestData(0, 3);

		Assert.assertEquals(actUid, expeUid);
	}

	 @Test(priority = 2)
	public void test2() {
		TCID = 102;
		order.gotoOrdersPage();
	}

	@AfterMethod
	public void logout(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			utilityClass.captureScreenShot(driver, TCID);

		}

	}
	

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();

	}

}
