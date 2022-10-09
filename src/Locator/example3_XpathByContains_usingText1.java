package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_XpathByContains_usingText1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		// xpath by contains with text
		//--  //tagname[contains(text(),'text value')]
		
		driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();
		
		 
		
	}

}
