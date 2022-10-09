package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_DDF 
{
	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		//identify the user id element and send id
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("ZAX405");
		
		//identify the PWD element
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Akshay@1437");
		
		//click on login element
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		Thread.sleep(2000);
		 
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("143707");
		
		//click on continue button
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		// get the text of user id
		String text = driver.findElement(By.xpath("//span[text()='ZAX405']")).getText();
		
		String expUI = "ZAX405";
		
		if(text.equals(expUI))
		{
			System.out.println("PASS");
			
		}
		
		
		
		
		
	}

}
