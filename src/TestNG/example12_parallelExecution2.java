package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example12_parallelExecution2
{

	@Test
	public void openFB() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}
	
}
