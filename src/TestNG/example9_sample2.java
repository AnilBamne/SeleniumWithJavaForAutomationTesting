package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_sample2
{
	
	@Test
	public void tc4()
	{
		Reporter.log("running test case 4");
		
	}
	
	@Test
	public void tc5()
	{
		Reporter.log("running test case 5");
		
	}

	
	@Test				// this test case will be restricted from execution
	
	public void tc6()
	{
		Reporter.log("running test case 6");
	}
}
