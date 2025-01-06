package TestNg;

import org.testng.annotations.Test;

public class ex8_GroupingClass1 {
	@Test(groups = "login")
	public void Tc1() {
		System.out.println("running Tc1");
		
	}
	@Test(groups="profile")
    public void Tc2() {
    	System.out.println("ruuning Tc2");
		
	}
    @Test(groups="login")
    public void Tc3() {
    	System.out.println("running Tc3");
	
    }



}
