package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	@FindBy(xpath = "//span[@class=\"user-id\"]")
	private WebElement Userid;

	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getKiteHomePageActUserID() {
		String actuserid = Userid.getText();
		return actuserid;

	}

}
