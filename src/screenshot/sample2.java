package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample2 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String s = RandomString.make(3);
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\HP\\Desktop\\Selenium\\screeshot\\screenshot"+s+".jpg");
		FileHandler.copy(scr, dest);
		
		
	}

}
