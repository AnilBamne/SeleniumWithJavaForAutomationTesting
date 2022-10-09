package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example3_isMultiple2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/selectmultiple.html");	
		
//		click on create a new 
		WebElement country = driver.findElement(By.xpath("//select[@id='12345']"));

		Thread.sleep(2000);
		//		click on month box and store it in a object
		Select s=new Select(country);
		
		boolean result = s.isMultiple();
 		System.out.println(result);
 		
 		if(result==true)
 		{
 			System.out.println("Listbox is multiselectale");
 			
 		}
 		else
 		{
 			System.out.println("Listbox is single selectable");
 		}
 		Thread.sleep(3000);
 		driver.close();
		
		
		
	}

	 
}
