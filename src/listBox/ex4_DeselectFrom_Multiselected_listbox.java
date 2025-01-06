package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4_DeselectFrom_Multiselected_listbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/Dropdown.html");
		Thread.sleep(2000);
	WebElement element =	driver.findElement(By.xpath("//select[@id='countries']"));
	
	Select s = new Select(element);
	s.selectByIndex(2);
	s.selectByIndex(1);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.deselectByIndex(1);
	s.deselectByIndex(0);
		
	}
}
