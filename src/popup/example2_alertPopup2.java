package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class example2_alertPopup2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");

//		enter customer id
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asdf");
		
//		click on submit btn
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
//		switch to alert popup
		Alert alt = driver.switchTo().alert();
		
//		get text on the popup
		String text = alt.getText();
		System.out.println(text);
		
//		click on cancel button
		alt.dismiss();
		

		Thread.sleep(2000);
		
		//click on OK btn from 1st Alert popup
		alt.accept();
		
		//Again click on OK btn from 2nd Alert popup
		alt.accept();


		
		
		
	}

}
