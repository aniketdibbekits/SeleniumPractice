package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex6_isMultiple {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
WebElement element =	driver.findElement(By.xpath("//select[@id='month']"));

Select s = new Select(element);
boolean result = s.isMultiple();
if(result)
{
	System.out.println("this is multiple");
}
else
{
	System.out.println("not multiple");
}

	}

}
