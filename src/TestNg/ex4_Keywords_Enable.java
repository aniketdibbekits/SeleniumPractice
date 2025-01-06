package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex4_Keywords_Enable {
	@Test
	public void tc1() {
		Reporter.log("TC1",true);
		
	}
	
	@Test (enabled = false)
	public void tc2() {
		Reporter.log("TC2",true);
		
	}
	
	@Test
	public void tc3() {
		Reporter.log("TC3",true);
		
	}

}
