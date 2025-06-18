
package webdriver_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=EnZLTXyEd2k&t=1518s");
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.navigate().back();

		driver.navigate().forward();
		driver.navigate().refresh();

//		driver.close();
		}

}
