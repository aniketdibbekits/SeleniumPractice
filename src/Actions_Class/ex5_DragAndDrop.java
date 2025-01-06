package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex5_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Thread.sleep(2000);
//	WebElement source =	driver.findElement(By.xpath("//li[@class='block13 ui-draggable'][1]"));
//	
//	WebElement dest = driver.findElement(By.xpath("//div[@class='ui-widget-content'][3]"));
		
	      WebElement source = driver.findElement(By.xpath("//li[contains(@class, 'block13')][1]"));
	      WebElement dest = driver.findElement(By.xpath("//div[@class='ui-widget-content'][3]"));
	       // WebElement dest = driver.findElement(By.xpath("//ol[@id='amt8']"));

	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(source, dest).perform();
	//act.moveToElement(source).clickAndHold().moveToElement(dest).release().perform();
	//Thread.sleep(2000);
	
	//driver.quit();
	}

}
