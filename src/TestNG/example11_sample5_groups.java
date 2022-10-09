package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example11_sample5_groups 
{
	@Test(groups = "login")
	public void TC1()
	{
		Reporter.log("runnikng tc1");
	}
	
	@Test(groups = "login")
	public void TC2()
	{
		Reporter.log("runnikng tc2");
	}
	
	@Test(groups = "profile")
	public void TC3()
	{
		Reporter.log("runnikng tc3");
	}
	@Test(groups = "funds")
	public void TC4()
	{
		Reporter.log("runnikng tc4");
	}
	
	

}
