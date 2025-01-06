package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//it is used perform rightclick
public class Ex2_ContextClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
WebElement element =driver.findElement(By.xpath("//span[text()='Login']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).contextClick().perform();
		
		driver.quit();
	}

}
