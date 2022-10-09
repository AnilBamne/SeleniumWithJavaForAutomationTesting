package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example8_AssertClass5_assertNull
{

	@Test
	public void assertNull()
	{
		String actResult="abc";
		
		Assert.assertNull(actResult,"Failed act result is not null :  ");	
	}

}
