package webdriver_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class basicmethods {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
	}

}
