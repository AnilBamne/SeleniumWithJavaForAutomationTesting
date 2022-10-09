package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOptionFrom_MultiSelectableListbox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/selectmultiple.html");
		
		//step1
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='12345']"));
		
		//step2
		 Select s=new Select(selectcountry);
		
		//step3
		 s.selectByVisibleText("India");
		 
		 s.selectByIndex(2);
		 
		 //s.selectByValue("1");
		
		
	}

}
