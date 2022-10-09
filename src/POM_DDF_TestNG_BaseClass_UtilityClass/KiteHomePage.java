package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v100.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath = "//span[text()='ZAX405']") private WebElement Userid;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getKiteHomePageActUserID()
	{
		String actuserid = Userid.getText();
		return actuserid;
		
	}
	

}
