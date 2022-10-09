package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class example1_get 
{
	
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");		
	}


}
