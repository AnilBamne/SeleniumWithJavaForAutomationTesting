package HandlingOfMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_printAllLinksFromWebpage
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement s1:links)
		{
			System.out.println(s1.getText());
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	
}
