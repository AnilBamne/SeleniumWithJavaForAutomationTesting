package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
		

		//enter UN
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
				
		 WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		 username.sendKeys("anil");
		 Thread.sleep(2000);
				 
		 username.clear();
		 username.sendKeys("andy");
		 
		//enter pasw
				 
		 WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		 password.sendKeys("bamne");
		 Thread.sleep(2000);
		 password.clear();
		 password.sendKeys("12345");
		 
				 
		Thread.sleep(2000);
		driver.close();
				
		
	}

}
