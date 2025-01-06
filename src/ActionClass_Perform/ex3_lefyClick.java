package ActionClass_Perform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex3_lefyClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
	WebElement cart = driver.findElement(By.xpath("//a[@title='Cart'][2]"));
	Actions act = new Actions(driver);
	act.moveToElement(cart).click().perform();
	Thread.sleep(3000);
	driver.quit();
		
	
	
	
	
	
		
		
		
		
		
		
		
		driver.quit();
	}

}
