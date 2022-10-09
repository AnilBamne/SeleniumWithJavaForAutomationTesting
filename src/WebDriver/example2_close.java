package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class example2_close 

{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(3000);     //milli sec
	
	
	driver.close();
	
	}


}
