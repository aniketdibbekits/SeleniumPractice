package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex7_getFirstSelectedOptionFromMultiselected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/Dropdown.html");
		Thread.sleep(2000);
		WebElement countries = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s = new Select(countries);
		s.selectByIndex(1);
		s.selectByVisibleText("SRI");
		String txt = s.getFirstSelectedOption().getText();
		System.out.println(txt);
	}

}
