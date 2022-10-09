package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_AssertClass1_assertEquals
{
	@Test
	public void assertEquals() 
	{
		String actual = "anil";
		String expected = "anil";
		
		Assert.assertEquals(actual, expected,"fail:act and expected resultes are diff");
		
	}

}
