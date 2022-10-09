package HandlingOfMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_printSizeOf_AllLinksFromWebpage 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		
	}

}
