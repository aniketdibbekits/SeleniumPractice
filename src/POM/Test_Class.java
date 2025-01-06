package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//this is for login page
		SwagLabLoginPage login = new SwagLabLoginPage(driver);
		login.firstName("standard_user");
		login.passWord("secret_sauce");
		login.clickBtn();
		
		Thread.sleep(2000);
		
		//this is for home page
		
		SwagLabHomePage home = new SwagLabHomePage(driver);
		home.verifyLogo();
		home.clickonMenubar();
	}
}
