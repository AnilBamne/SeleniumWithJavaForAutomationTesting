package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_XpathBytext2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		//click on create new link  //tagname[text()='text value']
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		Thread.sleep(3000);
		
		driver.close();
	}

}
