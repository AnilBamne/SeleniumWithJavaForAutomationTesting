package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword2_priority2 
{
	
	@Test(priority=1)                   //duplicate priority=1
	public void TC3() 
	{
		Reporter.log("running TC3",true);
	}
	
	@Test(priority=1)               //duplicate priority=1
	public void TC5() 
	{
		Reporter.log("running TC5",true);
	}
	
	@Test                //by default priority=0
	public void TC2() 
	{
		Reporter.log("running TC2",true);
	}
	
	
	@Test(priority=3)
	public void TC1() 
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(priority=-2)						//negative priority is possible 
	public void TC4() 
	{
		Reporter.log("running TC4",true);
	}

}
