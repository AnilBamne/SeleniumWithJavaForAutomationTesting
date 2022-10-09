package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example6_dependsOnMethod2
{
	@Test
	public void login1()  
	{
		Reporter.log("running Login1 TC",true);
	}
	
	@Test
	public void login2()  
	{
		Reporter.log("running Login2 TC",true);
	}
	
	
	@Test(dependsOnMethods= {"login1","login2"})		//passes only if both methods are pass
	public void logout()  
	{
		Reporter.log("running Logout TC",true);
	}

}
