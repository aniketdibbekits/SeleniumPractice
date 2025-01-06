package webdriver_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class maximize_minimize {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=EnZLTXyEd2k&t=1518s");
		Thread.sleep(3000);
//		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		
	}

}
