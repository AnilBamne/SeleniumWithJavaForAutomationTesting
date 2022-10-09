package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_SwitchToFrame 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");	



		//switch to frame
		//driver.switchTo().frame("iframeResult");           //provide String frameName
		//driver.switchTo().frame("iframeResult");           //provide String frameID
		//driver.switchTo().frame(1);                        //provide int frameIndex

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); //provide iframe webelement

		//click on click me btn
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		

		
	}

}
