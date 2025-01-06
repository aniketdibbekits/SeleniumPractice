package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex10_getSelectedSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/Dropdown.html");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s = new Select(month);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(1);
		List<WebElement> selectedOption = s.getAllSelectedOptions();
		System.out.println(selectedOption.size());
		
	}

}
