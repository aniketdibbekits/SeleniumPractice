package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		//driver.switchTo().frame("iframeResult"); //string name
		//driver.switchTo().frame("iframeResult");  //id
		driver.switchTo().frame(driver.findElement( By.xpath("//iframe[@id='iframeResult']")));  //xpath
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();
		
		
	}

}
