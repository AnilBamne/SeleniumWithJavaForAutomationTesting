package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogiun2Page 
{
	
	@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement ContBtn;
	
	
	public KiteLogiun2Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void inpKiteLogiun2Pagepin(String pin) 
	{
		Pin.sendKeys(pin);
	}
	
	public void clickKiteLogiun2Pagecntbtn()
	{
		ContBtn.click();
	}
	

}
