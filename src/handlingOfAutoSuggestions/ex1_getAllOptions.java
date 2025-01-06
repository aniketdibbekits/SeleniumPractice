package handlingOfAutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_getAllOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("abc");
		Thread.sleep(2000);
		List<WebElement> allRes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(WebElement s:allRes) {
			System.out.println(s.getText());
		}
		driver.quit();
		
	}

}
