package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_leftClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	WebElement element =	driver.findElement(By.xpath("//span[text()='Login']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(element).click().perform();
	
	Thread.sleep(2000);
	
	driver.quit();
	}

}
