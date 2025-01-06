package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex2_EmailableReport {
    @Test
	public void Tc1() {
		
		Reporter.log("showing Tc1",false);
	}
    @Test
	public void Tc2() {
	
		Reporter.log("showing Tc2",true);

	}
    @Test
	public void Tc3() {
	
		Reporter.log("showing Tc3",false);

	}
    @Test
	public void Tc4() {
	
		Reporter.log("showing Tc4",true);

	}




}
