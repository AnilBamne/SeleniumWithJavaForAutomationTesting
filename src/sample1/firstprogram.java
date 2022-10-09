package sample1;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram 
{
	public static void main(String[] args) 
	{
		//Step1: set path of ChromeDriver.exe file
		//parameter1- name of browser (small letter)
		//parameter2- path of browser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		//Step2: Create an object of Chrome Driver class		
		
		ChromeDriver driver=new ChromeDriver();
		
	}

}
