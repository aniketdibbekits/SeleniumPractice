package ActionClass_Perform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_handleDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	WebElement el =	driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions act = new Actions(driver);
	act.moveToElement(el).perform();
	Thread.sleep(3000);
		driver.quit();
	}

}
