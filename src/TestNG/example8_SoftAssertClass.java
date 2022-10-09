package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example8_SoftAssertClass 
{
	@Test
	public void TC()
	{
		
		SoftAssert soft = new SoftAssert();
		
		String a="name";
		String b="noun";
		boolean result = false;

		soft.assertEquals(a, b);
		
		soft.assertTrue(result);
		
		soft.assertAll();		// in soft assert we can perform multiple assert actions by callin g  soft.assertAll()  function at last
				
		
		
	}

}
