package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example10_Sample4
{
	@Test
	public void TC4() 
	{
		Reporter.log("running TC4",true);
	}
	
	
	@Test                
	public void TC5() 
	{
		String s= "andy";
		String s1="anil";
		
		Assert.assertEquals(s, s1);			//this test case is failed
		
	}
	
	
	@Test                 
	public void TC6() 
	{
		Reporter.log("running TC3",true);
	}

}

