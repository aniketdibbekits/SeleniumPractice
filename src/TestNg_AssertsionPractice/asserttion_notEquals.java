package TestNg_AssertsionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asserttion_notEquals {
	@Test
	public void tc1() {
		String act = "abcd";
		String exp = "abcde";
		Assert.assertNotEquals(act, exp,"Result is");
		
	}

}
