package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_ById {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C://Users//HP//Downloads/Tagname.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("abc123")).sendKeys("Aniket");
		driver.findElement(By.id("abc1234")).sendKeys("Dibbe");
		driver.findElement(By.xpath("//a[text()='click here']")).click();

		
	}

}
