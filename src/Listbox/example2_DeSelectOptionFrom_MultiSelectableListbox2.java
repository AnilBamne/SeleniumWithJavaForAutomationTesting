package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_DeSelectOptionFrom_MultiSelectableListbox2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/selectmultiple.html");
		
		//step1
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='12345']"));
		//step2:
				Select s=new Select(selectCountry);
				
				//step3: 
				s.selectByIndex(0);
				s.selectByIndex(2);
				s.selectByIndex(3);
				s.selectByVisibleText("Framce");
				
				Thread.sleep(3000);
				
				s.deselectAll();
				
		Thread.sleep(2000);
		driver.close();
	}

}
