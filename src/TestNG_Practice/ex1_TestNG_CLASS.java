package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex1_TestNG_CLASS {
//	@Test
//	public void printName() {
//		System.out.println("My name is anthony");
//		
//	}
//	
//	@Test
//	public void LastName() {
//		System.out.println("Gonsawis's");
//		
//	}
	@Test
	public void name() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
