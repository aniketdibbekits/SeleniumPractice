package Webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex9_isSelectedPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions Act = new Actions(driver);
		Act.moveToElement(element).click().perform();
		
		Thread.sleep(1000);
		
		  List <WebElement> clickhere = driver.findElements(By.xpath("(//span[@class='_3Pzn-c'])"));
//		  clickhere.get(1).click();
		  System.out.println(clickhere.get(1).isDisplayed());
		  System.out.println(clickhere.get(1).isEnabled());

 
	}

}
