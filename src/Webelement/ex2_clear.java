package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_clear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement el = driver.findElement(By.xpath("//input[@id='email']"));
		el.sendKeys("aniket");
		Thread.sleep(2000);
		el.clear();
		el.sendKeys("Rachi");
		
	}

}
