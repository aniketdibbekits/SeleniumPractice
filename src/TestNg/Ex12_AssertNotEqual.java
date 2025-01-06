package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex12_AssertNotEqual {
	@Test
	public void Tc2() {
		String actResult = "abcd";
		String expResult = "xyz";
		Assert.assertNotEquals(actResult,expResult,"Rewsult is passed");
	}

}
