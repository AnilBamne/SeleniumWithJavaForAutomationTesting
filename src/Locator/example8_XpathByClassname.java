package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_XpathByClassname 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/Xpath_locator/byClassName.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("abc123")).sendKeys("Badboy");
		
		driver.findElement(By.className("abc123")).sendKeys("Andy");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
