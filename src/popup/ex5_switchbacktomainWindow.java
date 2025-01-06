package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_switchbacktomainWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

		Set<String> ids = 	driver.getWindowHandles();
		ArrayList<String> allIds = new ArrayList<>(ids);
		String childWindow = allIds.get(1);
		String mainWindow = allIds.get(0);
		
		driver.switchTo().window(childWindow);
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//span[text()='WebdriverIO']")).click();
		driver.switchTo().window(mainWindow);

	}

}
