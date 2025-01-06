package POM_WITH_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream file = new FileInputStream("D:\\aniket dibbe docs\\seleniumData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");

		LoginPage login = new LoginPage(driver);
		login.setFirstName(sh.getRow(0).getCell(0).getStringCellValue());
		login.Password(sh.getRow(0).getCell(1).getStringCellValue());
		login.clickSubmit();
//		login.errorValidate(sh.getRow(0).getCell(2).getStringCellValue());
		
		HomePage home = new HomePage(driver);
		home.validateLogo(sh.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.quit();



	}

}
