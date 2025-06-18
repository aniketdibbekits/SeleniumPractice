package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex5_Keywords_Priority {
	
	@Test (priority = 2)
	public void tc1() {
		Reporter.log("TC1",true);
		
	}
	
	@Test (priority = 100)
	public void tc2() {
		Reporter.log("TC2",true);
		
	}
	
	@Test (priority = 0)
	public void tc3() {
		Reporter.log("TC3",true);
		
	}
	
	@Test (priority = 100)
	public void tc4() {
		Reporter.log("TC4",true);
		
	}

}
