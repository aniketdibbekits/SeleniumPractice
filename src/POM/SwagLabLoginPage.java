package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement  FN;
	@FindBy(xpath="//input[@id='password']") private WebElement  PWD;
	@FindBy(xpath="//input[@type='submit']") private WebElement  clickBtn;
	
	
 public	SwagLabLoginPage(WebDriver driver ){
	 PageFactory.initElements(driver, this);
		
	}
 
 public void firstName(String firstname) {
	FN.sendKeys(firstname);
}
 
 public void passWord(String password) {
	 PWD.sendKeys(password);
		
 }
 
 public void clickBtn() {
	 clickBtn.click();
		
 }
 	
 	
	

}
