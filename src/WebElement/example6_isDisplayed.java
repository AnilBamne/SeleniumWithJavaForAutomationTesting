package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isDisplayed 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println(logo);
		
		if(logo==true)
		{
			System.out.println("logo is displaYED");
		
		}
		else
		{
			System.out.println("logo is not displayed");
		}
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
