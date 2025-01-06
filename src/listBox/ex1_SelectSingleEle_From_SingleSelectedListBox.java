package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_SelectSingleEle_From_SingleSelectedListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
	WebElement element =	driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s = new Select(element);
	//s.selectByIndex(2);
	s.selectByValue("2");
	//s.selectByVisibleText("Mar");
	}

}
