package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//it is used to check visibility of web element
public class ex7_isDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	boolean res = 	driver.findElement(By.xpath("//img[@class='_97vu img']")).isDisplayed();
		if(res) {
			System.out.println("displayed");
		}
		else {
			System.out.println("Not displayed");
		}
		
		
	}

}
