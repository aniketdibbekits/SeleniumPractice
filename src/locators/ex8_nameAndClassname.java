package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_nameAndClassname {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C://Users//HP//Downloads/Tagname.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("xyz123")).sendKeys("rachi");
		driver.findElement(By.className("1234")).sendKeys("dibbe");
		driver.findElement(By.tagName("a")).click();
		
	}

}
