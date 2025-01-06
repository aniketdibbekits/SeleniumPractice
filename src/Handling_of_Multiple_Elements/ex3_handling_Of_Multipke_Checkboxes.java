package Handling_of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_handling_Of_Multipke_Checkboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/checkboxes.html");
		Thread.sleep(2000);
		
//	List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//label"));

	for(WebElement check: allCheckboxes) {
//		check.click();
		System.out.println(check.getText());

		Thread.sleep(3000);
	}
	//System.out.println(check.getText());

	}

}
