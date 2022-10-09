package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_XpathByIndex
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		// clic on create new acc
		// //tagname[text()='text value']
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		// enter UN
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("andy");
		
		//enter pw
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("andy");
		
		//enter mob no.
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8979767");
		
	}

}
