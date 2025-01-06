package webdriver_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(2000);
		driver.close();	}

}
