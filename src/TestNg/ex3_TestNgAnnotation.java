package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex3_TestNgAnnotation {
	@BeforeClass

	public void openBrowser() {
		Reporter.log("Open Browser",true);
		
	}
	
	@BeforeMethod
	public void loginpage() {
		Reporter.log("login the page",true);
	}
	@Test(priority=2)
	public void verifyLogo() {
		Reporter.log("verify the logo",true);
		
	}
	@Test(priority=1)
	public void verifyLogo1() {
		Reporter.log("verify the logo1",true);
		
	}
	
	@AfterMethod
	public void logoutPage() {
		Reporter.log("logout the page",true);
		
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close the Browser");
		
	}

}
