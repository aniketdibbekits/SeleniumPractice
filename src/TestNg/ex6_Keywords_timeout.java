package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keywords_timeout {
	
	@Test (timeOut = 2000)
	public void tc1() {
		Reporter.log("TC1 executed",true);
		
	}

}
