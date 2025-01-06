package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_ToFindSpecificElemnt {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/web_table%20(1).html");
		String data = driver.findElement(By.xpath("//table[@id='1234']//tr[2]//td[3]")).getText();
		System.out.println(data);
		driver.quit();
	}

}
