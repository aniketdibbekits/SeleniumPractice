package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ex1_TestNgClass {
	@Test
	public void Tc() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

}
