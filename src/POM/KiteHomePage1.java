package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage1
{
	
	//step1
	
	@FindBy(xpath = "//span[text()='ZAX405']") private WebElement UserID;
	
	
	//step2
	public KiteHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3
	public void VerifyKiteHomePageUserID()			//Proper naming convention should be there
	{
		String actUID = UserID.getText();
		String expUID="ZAX405";
		
		if(actUID.equals(expUID))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
