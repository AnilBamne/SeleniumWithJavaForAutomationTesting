package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example11_sample6_groups 
{
	

	@Test(groups = "login")
	public void TC5()
	{
		Reporter.log("runnikng tc5");
	}
	
	@Test(groups = "profile")
	public void TC6()
	{
		Reporter.log("runnikng tc6");
	}
	
	@Test(groups = "profile")
	public void TC7()
	{
		Reporter.log("runnikng tc7");
	}
	@Test(groups = "funds")
	public void TC8()
	{
		Reporter.log("runnikng tc8");
	}
	
	
	
	
	

}
