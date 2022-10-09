package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample1 
{
	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest = new File("C:\\Users\\HP\\Desktop\\Selenium\\screeshot\\xyz.jpg");
		FileHandler.copy(src, dest);
	}

}