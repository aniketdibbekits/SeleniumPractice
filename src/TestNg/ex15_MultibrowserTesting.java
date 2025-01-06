package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex15_MultibrowserTesting {
	@Parameters("BrowserName")
	@Test
	public void Tc(String BrowserName) {
		WebDriver driver = null;
		if(BrowserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(BrowserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
WebElement element = driver.findElement(By.xpath("//div[@class='app_logo']"));
 String acttext = element.getText();
 String exptext = "Swag Labs";
 
 Assert.assertEquals(acttext, exptext,"result should be true");
 
		
	}

}
