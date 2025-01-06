package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex10_partialLinkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C://Users//HP//Downloads/Tagname.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("cl")).click();
		
	}

}
