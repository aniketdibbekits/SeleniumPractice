package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//button[text()='Open Menu']") private WebElement MENU;
	@FindBy(xpath="//a[text()='About']") private WebElement ABOUT;

	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenu() {
		MENU.click();
	}
	public void aboutPage() {
		ABOUT.click();
		
	}

}
