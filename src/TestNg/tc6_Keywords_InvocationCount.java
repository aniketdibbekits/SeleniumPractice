package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class tc6_Keywords_InvocationCount {
	
	@Test (invocationCount = 4)
	public void Tc1() {
		Reporter.log("TC1",true);
		
	}

}
