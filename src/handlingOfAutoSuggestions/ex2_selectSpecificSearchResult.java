package handlingOfAutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_selectSpecificSearchResult {
	public static void main(String[] args) throws InterruptedException {
//		ABCD
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		Thread.sleep(2000);
		String exp = "iPhone 16";
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Iphone");
		List<WebElement> allRes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(WebElement s1:allRes) {
			String text = s1.getText();
			if (text.equalsIgnoreCase(exp)) {
			    s1.click();
			    System.out.println(text);
			    break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
