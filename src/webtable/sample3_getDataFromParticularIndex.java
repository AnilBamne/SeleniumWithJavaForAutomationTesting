package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_getDataFromParticularIndex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/WebTable.html");
		Thread.sleep(2000);
		
		//to get perticular index data ,identify the all columns x-path and then give the perticular index
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
