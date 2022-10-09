package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class1
public class KiteLogin1Page1
{
//	step1: crate data members privetly "encpsulation" 
	
	@FindBy(xpath ="//input[@id='userid']" )  private WebElement UserID;
	@FindBy(xpath ="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath ="//button[text()='Login ']") private WebElement LoginBtn;
	
//	step2: create cunstructor to initilize these variables with PageFactory class
	
	public KiteLogin1Page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//  step3:use them in methods	
	
	//method1
	public void inputKiteLogin1PageUID() 
	{
		UserID.sendKeys("ZAX405");
	}
	
	//method2
	public void inputKiteLogin1PagePWD()
	{
		PWD.sendKeys("Akshay@1437");
	}
	
	//method3
	public void clickOnKiteLogin1PageLoginBtn()
	{
		LoginBtn.click();	
	}
	

}
