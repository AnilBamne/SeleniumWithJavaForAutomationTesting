package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword1_invocationCount 
{
	@Test(invocationCount = 4)        //invocation count executes the method multiple times
	public void tc1() 
	{
		Reporter.log("running tc1");
	}
	
	

}
