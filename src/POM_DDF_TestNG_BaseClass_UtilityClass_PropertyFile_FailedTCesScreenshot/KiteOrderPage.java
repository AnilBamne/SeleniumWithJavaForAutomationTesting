package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile_FailedTCesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteOrderPage {
	@FindBy(xpath = "//a[@class='orders-nav-item']")
	private WebElement Order;

	public KiteOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void gotoOrdersPage() {
		Order.click();

	}
}
