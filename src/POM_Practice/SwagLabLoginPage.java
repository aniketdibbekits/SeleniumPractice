package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	@FindBy(xpath="//input[@id='user-name']") private  WebElement FIRSTNAME;
	@FindBy(xpath="//input[@id='password']") private  WebElement PASSWORD;
	@FindBy(xpath="//input[@type='submit']") private WebElement LOGINBTN;
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFirstName(String firstName) {
		FIRSTNAME.sendKeys(firstName);
	}
	
	public void Password(String password) {
		PASSWORD.sendKeys(password);
	}
	
	public void clickSubmit() {
		LOGINBTN.click();
	}
	


}


//in pom every webpage is considered as POM class
//POmM class will contain all the logic
//To execute POM class we will create one Test class
