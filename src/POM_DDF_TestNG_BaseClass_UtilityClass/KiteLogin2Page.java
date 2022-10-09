package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	
	@FindBy(xpath ="//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath ="//button[@class='button-orange wide']") private WebElement ContBtn;


public KiteLogin2Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void inpKiteLogin2PagePin(String pin)
{
	Pin.sendKeys(pin);
}
public void clickKiteLogin2PageContBtn()
{
	ContBtn.click();
}


}