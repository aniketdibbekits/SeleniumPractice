package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_sizeOfColumn {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/web_table%20(1).html");
		int RowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(RowSize);
		driver.quit();
	}

}
