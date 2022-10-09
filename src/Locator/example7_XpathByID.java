package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_XpathByID
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/Xpath_locator/xpathbyID.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("1234")).sendKeys("anil");
		
		driver.findElement(By.id("4567")).sendKeys("bamne");
		
		Thread.sleep(2000);
		
		driver.close();
		

		
	}

}
