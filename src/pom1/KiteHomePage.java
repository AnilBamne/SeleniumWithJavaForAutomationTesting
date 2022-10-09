package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath = "//span[text()='ZAX405']") private WebElement Userid;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyKiteHomePageuid(String expUid)
	{
		String actUserID = Userid.getText();
		
		if(expUid.equals(actUserID))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	
	
	

}
