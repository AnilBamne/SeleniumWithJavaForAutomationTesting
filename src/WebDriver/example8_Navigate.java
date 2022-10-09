package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class example8_Navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.close();
		

		
	}

}
