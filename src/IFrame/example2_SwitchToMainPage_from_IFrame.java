package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToMainPage_from_IFrame 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");	


		//switch to frame
		driver.switchTo().frame("iframeResult");           //String frameName
			
		//click on click me btn
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		
		Thread.sleep(3000);
		
		
		//switch to main page
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		//click on open menu
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		


		Thread.sleep(2000);
		driver.close();
		
	}

}
