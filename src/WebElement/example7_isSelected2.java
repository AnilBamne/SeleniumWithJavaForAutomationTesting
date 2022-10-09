package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_isSelected2
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//click on create new acc link
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
				
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//input[@class='_8esa']"));
		boolean result = button.isSelected();
		
		if(result==true)
		{
			System.out.println("button is already selected");
		}
		else
		{
			 
			 button.click();
			 boolean newresult = button.isSelected();
			 
			 if(newresult==true)
			 {
				  
				 System.out.println("male button is now selected");
			 }
			 else
			 {
				 
				  
				 System.out.println("male radio button is still not selected");
			 }
				 
			  
			 
		}
		
		
 	}

}
