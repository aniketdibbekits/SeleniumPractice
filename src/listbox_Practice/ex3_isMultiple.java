package listbox_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3_isMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/Dropdown.html");
		Thread.sleep(2000);
		WebElement countries = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s = new Select(countries);
		boolean res = s.isMultiple();
		if(res)
		{
			System.out.println("this is multiple");
		}
		else
		{
			System.out.println("not multiple");
		}

	}

}
