package popup;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class example3_switchToChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://skpatro.github.io/demo/links/");
		
//		click on new tab from main window
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
//		get child window id
		Set<String> allId = driver.getWindowHandles();		//[mainPageID childWindowID]
		
		ArrayList<String> al = new ArrayList<String>(allId);   //[mainPageID(0) childWindowID(1)]
		  
		String ChildWindowId = al.get(1);
		
//		switch to child window
		driver.switchTo().window(ChildWindowId);
		
		//click on training link from childWindow
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
 	}

}
