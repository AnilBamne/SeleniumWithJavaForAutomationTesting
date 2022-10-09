package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9_XpathByName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/Xpath_locator/Byname.html");
		
		driver.findElement(By.name("xyz123")).sendKeys("andy");
		
		driver.findElement(By.name("xyz123")).sendKeys("bamne");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
