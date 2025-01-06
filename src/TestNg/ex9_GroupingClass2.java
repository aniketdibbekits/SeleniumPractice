package TestNg;

import org.testng.annotations.Test;

public class ex9_GroupingClass2 {
	@Test(groups="profile")
	public void Tc4() {
		System.out.println("running Tc4");
		
	}
	@Test(groups="login")
    public void Tc5() {
    	System.out.println("ruuning Tc5");
		
	}
     @Test(groups="profile")
    public void Tc6() {
    	System.out.println("running Tc6");
	
    }


}
