package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_withDDF
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\Selenium\\FrameworkData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		driver.get("https://kite.zerodha.com/");
		 
		//use data from excel sheet
		String UserName=sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UserName);
		
		//identify the PWD element
		String pass=sh.getRow(0).getCell(1).getStringCellValue();
				
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
						
		//click on login element
		
						
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		Thread.sleep(2000);
						 
		 //enter pin
		String pin=sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
						
		 //click on continue button
		 driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
						
		 // get the text of user id
		 String text = driver.findElement(By.xpath("//span[text()='ZAX405']")).getText();
						
		String expUI =sh.getRow(0).getCell(3).getStringCellValue();
		
		if(text.equals(expUI))
		{
			System.out.println("PASS");
			
		}
		
			driver.quit();			
				
		
		
		
	}

}
