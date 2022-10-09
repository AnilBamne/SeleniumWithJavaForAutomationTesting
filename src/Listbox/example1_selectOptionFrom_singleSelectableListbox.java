package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOptionFrom_singleSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:/www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(3000);
		
		//step1:
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		//step2:
		Select s = new Select(month);
		
		//step3:
		s.selectByVisibleText("Mar");   //String text
		
		//s.selectByIndex(2);             //int index
		 
		//s.selectByValue("11");  			 // String value
	}

}

