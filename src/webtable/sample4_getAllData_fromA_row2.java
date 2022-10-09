package webtable;

import java.util.List;
import java.util.TreeSet;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_getAllData_fromA_row2
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/WebTable.html");
		 
		TreeSet<String> tree = new TreeSet<String>();
		
		List<WebElement> value = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td"));
		
		for(WebElement s1:value)
		{
			String text = s1.getText();
			tree.add(text);
			System.out.println(text);
			
		}
		
		System.out.println("------------------------");
		
		for(String s2:tree)
		{
			System.out.println(s2);
		}
		
		Thread.sleep(2000);
		driver.close();
	}

	 
	

}
 