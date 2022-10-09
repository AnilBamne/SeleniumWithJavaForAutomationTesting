package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_getText
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
