package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_alertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("7890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//when user wants to click on Ok
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	//	when user wants to click on cancel
		//driver.switchTo().alert().dismiss();
		
		//when user want to get the text
//	String text =	driver.switchTo().alert().getText();
//	System.out.println(text);
		
		
		driver.switchTo().alert().accept();
         driver.quit();
		
		
	}

}
