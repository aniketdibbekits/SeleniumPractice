package popUp_Practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChildWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
	Set<String> ids = 	driver.getWindowHandles();
	ArrayList<String> allIds = new ArrayList<>(ids);
	String childWindow = allIds.get(1);
	driver.switchTo().window(childWindow);
	driver.findElement(By.xpath("//span[text()='About me']")).click();
		
		
	}

}
