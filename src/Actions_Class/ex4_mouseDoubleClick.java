package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex4_mouseDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement el = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.moveToElement(el).doubleClick().perform();
		
		Thread.sleep(2000);
		
	String txt  =	driver.switchTo().alert().getText();
	System.out.println(txt);
		
		Thread.sleep(3000);
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}


}
