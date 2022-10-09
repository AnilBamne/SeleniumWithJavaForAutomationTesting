package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_getColSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/WebTable.html");
		Thread.sleep(2000);
		
//		//to find col size in header
//		int size = driver.findElements(By.xpath("//table[@id='1234']//tr[1]//th")).size();
//		System.out.println(size);
		
		//to find col size  mention row number
		int size = driver.findElements(By.xpath("//table[@id='1234']//tr[2]//td")).size();
		System.out.println(size);
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
