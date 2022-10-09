package webtable;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5_getallData_inaCol2
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/WebTable.html");
		 
	List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']//tr/td[2]"));
		
		TreeSet<String> tr=new TreeSet<String>();
		
		for(WebElement s1: allRows) 
		{
			String text = s1.getText();
			tr.add(text);
			System.out.println(text);
		}
		
		System.out.println("------------------");
		
		for(String s2 : tr) 
		{
			System.out.println(s2);
		}
				

		
		
	} 
	

}
