package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex10_Parallel3 {
	@Test
	public  void Tc3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}

}
