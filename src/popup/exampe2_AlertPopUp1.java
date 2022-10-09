package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampe2_AlertPopUp1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		//enter customer id
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
		
		//click on submit button
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		

		//getText from alert Popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		//click on cancel button
		driver.switchTo().alert().dismiss();
		

		Thread.sleep(2000);
		
		//click on OK btn
		driver.switchTo().alert().accept();
		
		
		//Again click on OK btn from 2nd alert popup
		driver.switchTo().alert().accept();

		
		driver.close();
		
		
		
	}

}
