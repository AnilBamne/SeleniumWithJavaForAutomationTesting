package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example4_getSelectedOption_from_singleSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
 		WebDriver driver=new ChromeDriver(); 
 		
 		driver.get("https://www.facebook.com/");	
		
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();		
		
		Thread.sleep(3000);
				
		//step1: 
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
		Select s=new Select(month);
		s.selectByVisibleText("Mar");
		Thread.sleep(2000);
		WebElement s1 = s.getFirstSelectedOption();
		String s2 = s1.getText();
		System.out.println(s2);
		Thread.sleep(2000);
		driver.close();
		
	
	}

}
