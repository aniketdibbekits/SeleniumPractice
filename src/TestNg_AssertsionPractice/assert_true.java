package TestNg_AssertsionPractice;

import org.testng.annotations.Test;

import graphql.Assert;

public class assert_true {
	@Test
	public void tc1() {
		boolean result = false;
		Assert.assertTrue(result);
	}

}
