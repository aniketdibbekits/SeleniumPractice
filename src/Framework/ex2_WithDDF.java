package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_WithDDF {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		FileInputStream file = new FileInputStream("D:\\aniket dibbe docs\\seleniumData.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String name = sh.getRow(0).getCell(0).getStringCellValue();
	String pass = sh.getRow(0).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(name);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	Thread.sleep(2000);
	}

}
