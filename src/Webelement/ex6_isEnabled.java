package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_isEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		boolean res = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if(res) {
			System.out.println("enabled");
		}
		else {
			System.out.println("Not");
		}

	}

}
