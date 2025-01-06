package TestNg_AssertsionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEquals {
	@Test
	private void tc1() {
		String act = "abcd";
		String exp = "abcd";
		Assert.assertEquals(act, exp,"Result is");
		
	}

}
