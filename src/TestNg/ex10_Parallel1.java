package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ex10_Parallel1 {
	@Test
	public  void Tc1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
