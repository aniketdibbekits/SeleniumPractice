package Actions_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex7_ScrollToElementByAmount {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.scrollByAmount(1000, 2000).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
