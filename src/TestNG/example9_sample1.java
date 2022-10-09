package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_sample1 
{
	
	@Test
	public void tc1()
	{
		Reporter.log("running test case1");
		
	}
	
	@Test
	public void tc2()
	{
		Reporter.log("running test case 2");
		
	}

	
	@Test				// this test case will be restricted from execution
	
	public void tc3()
	{
		Reporter.log("running test case 3");
	}
}
