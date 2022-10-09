package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example8_AssertClass6_assertNotNull
{

	@Test
	public void assertNotNull()
	{
		String actResult=null;
		
		Assert.assertNotNull(actResult, "Failed: act result is null");	
	}

}
