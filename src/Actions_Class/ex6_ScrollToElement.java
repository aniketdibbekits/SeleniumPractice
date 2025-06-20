package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex6_ScrollToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
		WebElement el = driver.findElement(By.xpath("//a[text()='Careers']"));
		Actions act = new Actions(driver);
		act.scrollToElement(el).perform();
		Thread.sleep(3000);
	}

}
