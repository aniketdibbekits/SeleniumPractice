package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	@FindBy(xpath="//span[text()='Solutions']") private WebElement SOLUTION;
	
	
	public AboutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSolution() {
		SOLUTION.click();
		
	}

}
