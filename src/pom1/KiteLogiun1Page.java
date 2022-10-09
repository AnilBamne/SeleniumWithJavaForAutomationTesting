package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogiun1Page
{
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement Username;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement LoginBtn;
	
	public KiteLogiun1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
 	}
	
	
	public void inpKiteLogiun1PageUsername(String UN) 		// methods with parameters
	{
		Username.sendKeys(UN);
		
	}
	
	public void inpKiteLogiun1Pagepassword(String pwd) 
	{
		Password.sendKeys( pwd);
		
	}
	
	public void clickKiteLogiun1PageLoginBtn () 
	{
		LoginBtn.click();
	}
	
	

}
