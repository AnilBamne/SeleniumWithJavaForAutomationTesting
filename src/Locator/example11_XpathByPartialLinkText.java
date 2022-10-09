package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11_XpathByPartialLinkText 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/Xpath_locator/byLuinktext.html");
		
		driver.findElement(By.partialLinkText("book")).click();
		
		
	}

}
