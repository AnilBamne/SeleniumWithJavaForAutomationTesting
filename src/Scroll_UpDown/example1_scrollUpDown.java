package Scroll_UpDown;

import org.checkerframework.framework.qual.JavaExpression;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class example1_scrollUpDown
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

		// down --> 2nd parameter +ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
		
					
		Thread.sleep(3000);
		
		// up --> 2nd parameter -ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");

			
		
		//		Thread.sleep(3000);
//		//right  --> 1st parameter +ve value
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
//		

		
//		Thread.sleep(3000);
//		//left  --> 1st parameter -ve value
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");
//		




		
		
	}
	
}
