package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_ByTagname {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C://Users//HP//Downloads/Tagname.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.findElement(By.tagName("input").sendKeys("aniket");
//		Thread.sleep(2000);
//	driver.findElement(By.tagName("input")).sendKeys("dibbe");
//		driver.findElement(By.tagName("a")).click();
		
	List<WebElement> allinput =	driver.findElements(By.tagName("input"));
	allinput.get(0).sendKeys("aniket");
	Thread.sleep(2000);
	allinput.get(1).sendKeys("dibbe");
driver.findElement(By.tagName("a")).click();
	

		
		
	}

}
