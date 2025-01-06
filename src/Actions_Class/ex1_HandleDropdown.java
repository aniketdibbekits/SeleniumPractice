package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_HandleDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
	WebElement element =	driver.findElement(By.xpath("//span[text()='Fashion']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[@class='_3490ry'][2]")).click();
	
	
		
		
		
		
		
		
		
		driver.quit();
	}

}
