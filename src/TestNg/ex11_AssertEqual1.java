package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex11_AssertEqual1 {
	@Test
	public void Tc1() {
		String actResult = "abcd";
		String excResult = "abcd";
		
		Assert.assertEquals(actResult, excResult,"Result is pass");
	}

}
