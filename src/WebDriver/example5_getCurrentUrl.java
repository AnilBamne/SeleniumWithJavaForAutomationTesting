package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class example5_getCurrentUrl 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//System.out.println(driver.getCurrentUrl());
		

		
	}

}
