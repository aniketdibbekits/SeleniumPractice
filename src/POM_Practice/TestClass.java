package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		//to execute POM class we will need test class
		//first we will create the object of POM class and call the methods
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		SwagLabLoginPage login = new SwagLabLoginPage(driver);
		login.setFirstName("standard_user");
		login.Password("secret_sauce");
		login.clickSubmit();
		//cfreate object of Home page
		HomePage home = new HomePage(driver);
		home.clickOnMenu();
		home.aboutPage();
//		Thread.sleep(3000);
		
		//create object of About page
		AboutPage about = new AboutPage(driver);
		driver.manage().window().fullscreen();
		about.clickOnSolution();
		Thread.sleep(3000);
		driver.quit();
	}

}
