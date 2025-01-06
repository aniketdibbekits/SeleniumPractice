package TestNg;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ex7_Keywords_depends {
	
	@Test
	public void openBrowser() {
		Reporter.log("Opening the browser",true);
		
	}
	
	@Test (dependsOnMethods = "aogin")
	public void aignUp() {
		Reporter.log("Signup",true);
		
	}
	
	@Test
	public void aogin() {
		Reporter.log("login",true);
		
	}


}
