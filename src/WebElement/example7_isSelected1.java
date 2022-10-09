package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_isSelected1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//click on create new acc link
		
				driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
				
				Thread.sleep(2000);
			
				
				boolean s1 = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
				System.out.println(s1);
				
				if (s1==true) 
				{
					System.out.println("radio button selected");
				} 
				else 
				{
					System.out.println("radio button is not Selected");
				}
				

		
	}

}
