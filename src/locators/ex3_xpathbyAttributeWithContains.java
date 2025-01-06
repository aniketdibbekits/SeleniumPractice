package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_xpathbyAttributeWithContains {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/signup/cold-join");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("aniket@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'pas')]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		//input[contains(@name,'email')]
//		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
	}

}
