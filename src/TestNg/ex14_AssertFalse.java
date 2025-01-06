package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex14_AssertFalse {
	@Test
	public class ex13_AssertTrue {
		public void Tc() {
			boolean result = false;
			Assert.assertFalse(result,"result should be false");
		}

	}

}
