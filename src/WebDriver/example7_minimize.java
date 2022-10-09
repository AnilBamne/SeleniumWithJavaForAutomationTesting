package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class example7_minimize 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");	
		
		driver.manage().window().minimize();
		
		//	Options s1 = driver.manage();
		//	Window s2 = s1.window();
		//	s2.maximize();

		Thread.sleep(2000);
		driver.close();
	}

}
