package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainPageFromIframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement( By.xpath("//iframe[@id='iframeResult']")));  //xpath
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();

		//driver.switchTo().parentFrame(): This moves you up one level in the frame hierarchy. If you're inside a frame within another frame, it takes you back to the frame just above the current one.

		//driver.switchTo().defaultContent(): This moves you out of all frames and brings you back to the main page (the top-level content).	
		
	}


}
