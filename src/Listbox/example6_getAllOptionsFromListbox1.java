package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example6_getAllOptionsFromListbox1 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/selectmultiple.html");	
		
//		click on create a new 
		WebElement country = driver.findElement(By.xpath("//select[@id='12345']"));

		Thread.sleep(2000);
		Select s = new Select(country);
//		s.selectByIndex(1);
//		s.selectByIndex(2);
//		s.selectByIndex(3);
//		
		List<WebElement> option = s.getOptions();
		for(WebElement s1:option)
		{
			System.out.println(s1.getText());
		}
		
	}

}
