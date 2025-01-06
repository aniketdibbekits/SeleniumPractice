package TestNg;

import org.testng.annotations.Test;

public class groupingPractice2 {
	@Test(groups = "login")
	public void tc10() {
		System.out.println("running 10");
		
	}
	
	@Test(groups = "home")
	public void tc11() {
		System.out.println("running 11");
		
	}
	
	@Test(groups = "payment")
	public void tc12() {
		System.out.println("running 12");
		
	}
	
	@Test(groups = "cart")
	public void tc13() {
		System.out.println("running 13");
		
	}
	
	@Test(groups = "home")
	public void tc14() {
		System.out.println("running 14");
		
	}
	
	@Test(groups = "login")
	public void tc15() {
		System.out.println("running 15");
		
	}






}
