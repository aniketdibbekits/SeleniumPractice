package POM_WITH_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@id='user-name']") private  WebElement FIRSTNAME;
	@FindBy(xpath="//input[@id='password']") private  WebElement PASSWORD;
	@FindBy(xpath="//input[@type='submit']") private WebElement LOGINBTN;
	@FindBy(xpath="//div[@class='error-message-container error']") private WebElement ERRORMSG;

	
	
	public LoginPage(WebDriver driver)
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
	
//	public void errorValidate(String errormsg) {
//		String error = ERRORMSG.getText();
//		if(error.equals(errormsg))
//		{
//			System.out.println("same error msg");
//		}
//		else {
//			System.out.println("Different error msg");
//		}
//		
//		
//	}

}
