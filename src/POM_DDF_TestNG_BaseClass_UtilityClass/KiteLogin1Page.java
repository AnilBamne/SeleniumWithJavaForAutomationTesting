package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	@FindBy(xpath = "//input[@id='userid']") private WebElement UserID;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement LoginBtn;
	
	
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void inpKiteLogin1PageUserid(String userid)
	{
		UserID.sendKeys(userid);
	}
	
	public void inpKiteLogin1PagePassword(String pwd) 
	{
	
		Password.sendKeys(pwd);
	}
	
	public void clickKiteLogin1PageLoginbtn()
	{
		LoginBtn.click();
	}

}
