package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex2_Emailable_Report {
	@Test
	public void tc1() {
		Reporter.log("TC1",true);

	}

	@Test
	public void tc2() {
		Reporter.log("TC2",true);
	}

	@Test
	public void tc3() {
		Reporter.log("TC3",true);
	}

	@Test
	public void tc4() {
		Reporter.log("TC4",true);
	}



}
