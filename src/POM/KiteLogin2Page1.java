package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLogin2Page1
{
	//step1
	@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement ContinueBtn;
	
	//step2
	public KiteLogin2Page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3
	public void inputKiteLogin2PagePin()
	{
		Pin.sendKeys("143707");
		
	}
	
	public void clickOnKiteLogin2PageContinueBtn()
	{
		ContinueBtn.click();
	}
	

}
