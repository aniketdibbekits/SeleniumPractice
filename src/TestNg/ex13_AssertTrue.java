package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class ex13_AssertTrue {
	public void Tc() {
		boolean result = true;
		Assert.assertTrue(result,"result should be true");
	}

}
