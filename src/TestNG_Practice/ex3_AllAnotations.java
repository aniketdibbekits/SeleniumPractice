package TestNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex3_AllAnotations {
	@AfterMethod
	public void Logout() {
		Reporter.log("Logout",true);
		
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);

	}
	
	@Test
	public void tc1() {
		Reporter.log("TC1",true);
	}
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Opening the browser",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);

		
	}

}
