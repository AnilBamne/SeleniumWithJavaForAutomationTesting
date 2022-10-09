package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_Annotation 
{
	
	@BeforeClass								                
	public void opnebrowser()
	{
		Reporter.log("----Open browser",true);
		
	}

	@BeforeMethod					// this annotation executes before running the methods, only one before method annotation can be userd in one class
	public void login() 
	{
		Reporter.log("---login to application----", true);
	}

	@Test
	public void VerifyUserid()
	{
		Reporter.log("running verify user id tc", true);
	}

	@Test
	public void Verifyuser2()
	{
		Reporter.log("running tc2");
		
	}
//	 this annotation executes after running the methods, only one after method annotation can be used in one class                                    
	@AfterMethod
	public void logout() 
	{
		Reporter.log("--- log out --------",true);
	}
	
	// this annotation executes after running the class
	@AfterClass
	public void closebrowser() 
	{
		Reporter.log("-----close browser------" , true);
		
	}
}