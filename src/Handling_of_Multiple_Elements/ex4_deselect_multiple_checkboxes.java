package Handling_of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_deselect_multiple_checkboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/checkboxes.html");
		Thread.sleep(2000);

		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(WebElement check: allCheckboxes) {
					check.click();

			Thread.sleep(3000);
		}
		for(int i=allCheckboxes.size()-1;i>=0;i--) {
			allCheckboxes.get(i).click();
			Thread.sleep(3000);
			

	}
}

}
