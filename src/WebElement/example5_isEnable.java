package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnable 

{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		

		boolean s2 = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(s2);
		
		if(s2==true) 
		{
			System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}
		
		

		
	}

}
