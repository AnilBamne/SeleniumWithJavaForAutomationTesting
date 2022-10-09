package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_XpathByContains_usingText2 
{
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		//  //tagname[contains(text(),'text value')]
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
		
		driver.manage().window().maximize();
		
	}

}
