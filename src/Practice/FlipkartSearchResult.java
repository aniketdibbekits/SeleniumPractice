package Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchResult {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mob");
		List<WebElement> el = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		for(WebElement e :el) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
