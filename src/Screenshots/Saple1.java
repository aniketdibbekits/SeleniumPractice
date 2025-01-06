package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saple1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest= new File("C:\\Users\\HP\\Desktop\\Selenium_screenshots\\sample.png");

		FileHandler.copy(src, dest);

	}

}
