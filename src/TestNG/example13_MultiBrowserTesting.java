package TestNG;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example13_MultiBrowserTesting 
{
	@Parameters("browserName")
	@Test
	public void multibroweserTesting(String browserName) throws InterruptedException
	{

		WebDriver driver=null;
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) 
		{
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			  driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");

		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("ZAX405");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Akshay@1437");
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("143707");
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expUserID = "ZAX405";
		
		if(actUserID.equals(expUserID)) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
		Thread.sleep(3000);
		driver.quit();
				
		

	}
	

}
