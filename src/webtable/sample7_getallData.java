package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample7_getallData 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/WebTable.html");
		 
		
		
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
		//          2<=4
		for(int i=1; i<=rowSize; i++) 
		{  //                                                               //tr[2]/*
			int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]/*")).size();  //3
			
			//          3<=3 
			for(int j=1; j<=colSize; j++) 
			{   //                                                               tr [2]/ *[3]
				String text = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/*["+j+"]")).getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
		
		
		// sr no      Book Type       Cost
		//   1        Manual        100
					

		
	}

}
