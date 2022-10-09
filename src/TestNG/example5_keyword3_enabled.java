package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword3_enabled
{
	@Test
	public void TC1() 
	{
		Reporter.log("running TC1",true);
	}
	
	
	@Test(enabled=false)                //this annotation restricts the execution of the methoid
	public void TC2() 						//  or disables the execution
	{
		Reporter.log("running TC2",true);
	}
	
	
	@Test(enabled=false)                  
	public void TC3() 
	{
		Reporter.log("running TC3",true);
	}
	
}
