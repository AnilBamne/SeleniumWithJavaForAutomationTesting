package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class example8_AssertClass2_assertNotEquals 
{
	
	@Test
	public void NotEquals()
	{
		String expected="hello";
		String actual = "helo";
		
		Assert.assertNotEquals( expected  , actual );
		
	}

}
