package Listbox;

import java.awt.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class get_all_options_using_treeset 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/HP/Desktop/Selenium/HTML%20programs/selectmultiple.html");
	
	//step1
	WebElement selectcountry = driver.findElement(By.xpath("//select[@id='12345']"));
	
	//step2
	 Select s=new Select(selectcountry);
	
	 
			
	 
	TreeSet<String> tr=new TreeSet<String>();
	
	
	java.util.List<WebElement> multipleOptions = s.getOptions();

	for(WebElement s1:multipleOptions)
	{
		String text = s1.getText();
		tr.add(text);
	}
	
	System.out.println("-------------------");
	
	
	for(String s1:tr) 
	{
		System.out.println(s1);
	}
	

	
}
}
