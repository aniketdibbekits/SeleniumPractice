package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_isSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		  List<WebElement> buttons = driver.findElements(By.xpath("//input[@id='sex']"));
		  buttons.get(2).click();
		boolean res =   buttons.get(2).isSelected();
		
		if(res) {
			String text = buttons.get(2).getText();
			System.out.println("Selected"+text);
		}
		else {
			System.out.println("Not selected");
		}
	}

}
