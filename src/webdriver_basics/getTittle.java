package webdriver_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTittle {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String url = driver.getTitle();
		System.out.println("Url is"+url);
		Thread.sleep(2000);
		driver.close();
		
	}

}
