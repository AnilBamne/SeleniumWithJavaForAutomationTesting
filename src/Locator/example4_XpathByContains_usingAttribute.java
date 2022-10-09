package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_XpathByContains_usingAttribute 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		//contains with attribute  //tagname[contains(@attributeName,'attributeValue')]
		
		//Enter Emailid or UN
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("andy");
		
		//enter PSWD
		
		driver.findElement(By.xpath("//input[contains(@data-testid,\"royal_pass\")]")).sendKeys("bamne");
		
		//click on signin
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		
	}

}
