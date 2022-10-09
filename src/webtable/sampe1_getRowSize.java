package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampe1_getRowSize
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/WebTable.html");
		Thread.sleep(2000);
		
		//to fetch multiple elements  use findElements 
		int size = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(size);
		
		Thread.sleep(3000);
		driver.close();
		
		 
	}
}
