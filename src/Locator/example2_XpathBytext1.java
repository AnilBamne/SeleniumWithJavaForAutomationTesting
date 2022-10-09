package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_XpathBytext1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		//click on forgotten password acc
		//---> //tagname[text()='text value']
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		Thread.sleep(3000);
		
		
		driver.close();
		
	}

}
