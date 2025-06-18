package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseWebdriver {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		List<WebElement> allanchor = driver.findElements(By.tagName("input"));
//		String anchor = allanchor.get(0);
		for(WebElement anc:allanchor) {
			System.out.println(anc.getText());
		}

	}

}
