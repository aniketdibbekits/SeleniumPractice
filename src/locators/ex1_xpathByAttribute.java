
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
		//username
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
		
		//password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		
		//login click
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
