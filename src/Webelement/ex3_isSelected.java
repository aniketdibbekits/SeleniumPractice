package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_isSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
  List<WebElement> buttons = driver.findElements(By.xpath("//input[@id='sex']"));
   buttons.get(2).click();
Thread.sleep(2000);
	boolean result =buttons.get(2).isSelected();
	if(result)
	{
	System.out.println("this is selected");
	}
	else
	{
		System.out.println("not");
	}
		
	}

}
