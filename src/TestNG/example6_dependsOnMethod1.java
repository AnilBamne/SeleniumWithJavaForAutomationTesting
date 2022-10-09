package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;    

public class example6_dependsOnMethod1
{
	@Test
	public void login()  
	{
		Reporter.log("running Login TC",true);
	}
	
	
	@Test(dependsOnMethods="login")			//if the login method fails this method also fails
	public void logout()  
	{
		Reporter.log("running Logout TC",true);
	}

}
