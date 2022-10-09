package POM_DDF_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zmq.socket.pubsub.Pub;

public class KiteLogin1Page 
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement Username;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement loginBtn;
	
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void inpKiteLogin1PageUsername(String UN) 
	{
		Username.sendKeys(UN);
		
	}
	public void inpKiteLogin1PagePassword(String PWD) 
	{
		Password.sendKeys(PWD);
		
	}
	public void clickKiteLogin1PageLoginBtn() 
	{
		loginBtn.click();
		
	}
	
	

}
