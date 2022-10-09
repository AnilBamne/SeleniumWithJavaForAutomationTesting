package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_getAllData_inA_RoW1
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/WebTable.html");
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td"));
		for(WebElement s1:data)
		{
			System.out.println(s1.getText()+" ");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
