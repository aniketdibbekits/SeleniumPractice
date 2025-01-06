package TestNg_AssertsionPractice;

import org.testng.annotations.Test;

import graphql.Assert;

public class assertFalse {
	@Test
	public void tc1() {
		boolean res = true;
		Assert.assertFalse(res);
		
	}

}
