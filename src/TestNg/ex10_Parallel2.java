package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex10_Parallel2 {
	@Test
	public  void Tc2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}


}
