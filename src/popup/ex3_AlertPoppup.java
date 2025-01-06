package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_AlertPoppup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("7890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		Alert alt =	driver.switchTo().alert();

		alt.accept();
		String text = alt.getText();
		System.out.println(text);





		driver.quit();
	}

}
