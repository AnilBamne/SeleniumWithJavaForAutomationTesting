package POM_DDF_testNG;

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
	
//	public void verifyKiteHomePageUserid(String expUid)
//	{
//		String actUid=Userid.getText();
//		
//		if(expUid.equals(actUid))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		
//	}
	
	public String getKiteHomePageActualUid()
	{
		return Userid.getText();
		
	}

}
