package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword4_Timeout
{
	
	@Test(timeOut = 5000)							// this keyword fails the execution if the given time is exceeding
	public void tc1() throws InterruptedException 
	{
		Thread.sleep(6000);
		Reporter.log("running tc1",true);
		
	}
	

}
