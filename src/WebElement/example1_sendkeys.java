package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_sendkeys 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//enter UN
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		
		 WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		 username.sendKeys("anil");
		 
		//enter pasw
		 
		 WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		 password.sendKeys("bamne");
		 
		Thread.sleep(3000);
		driver.close();
		
	}

}
