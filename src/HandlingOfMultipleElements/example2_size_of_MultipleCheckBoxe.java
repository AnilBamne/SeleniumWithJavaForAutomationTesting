package HandlingOfMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_size_of_MultipleCheckBoxe
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/multipleCheckboxes.html");
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
//		------select all check boxes----------
		
		for(WebElement s1:cb)
		{
			s1.click();
		}
		
		Thread.sleep(2000);
		
//		--------  deselect all check boxes  ----------
		
		for(int i=cb.size()-1;i>=0;i--)
		{
			cb.get(i).click();
			Thread.sleep(1000);
		}
		
		
		driver.close();
		
		
//		----  size of checkbox  ---------
		int size = cb.size();
		System.out.println(size);
	}
	
	

}
