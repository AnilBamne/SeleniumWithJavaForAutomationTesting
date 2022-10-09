package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(locator)
		//driver.findElement(By.xpath(xpathExpression));
		//xpathExpression formula is = tagname[@attributeName='attributevalue']
		
		driver.findElement(By.xpath("//input[@name='email']" )).sendKeys("anilbamne20@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Andy706");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
