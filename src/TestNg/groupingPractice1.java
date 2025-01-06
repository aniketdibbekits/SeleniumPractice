package TestNg;

import org.testng.annotations.Test;

public class groupingPractice1 {
	@Test(groups = "login")
	public void tc1() {
		System.out.println("running tc1");

	}

	@Test(groups = "profile")
	public void tc2() {
		System.out.println("running tc2");

	}

	@Test(groups = "home")
	public void tc3() {
		System.out.println("running tc3");

	}

	@Test(groups = "cart")
	public void tc4() {
		System.out.println("running tc4");

	}

	@Test(groups = "payment")
	public void tc5() {
		System.out.println("running tc5");

	}
	@Test(groups = "login")
	public void tc6() {
		System.out.println("running tc6");

	}



}
