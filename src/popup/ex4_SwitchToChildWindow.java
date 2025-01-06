package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_SwitchToChildWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Thread.sleep(2000);

		Set<String> ids=	driver.getWindowHandles();
		ArrayList<String> allids = new ArrayList<>(ids);

		String childWindow = allids.get(1);


		driver.switchTo().window(childWindow);



		driver.findElement(By.xpath("//span[text()='Training']")).click();
	}
}
