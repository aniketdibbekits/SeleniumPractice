package POM;

import java.awt.MenuBar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath="//button[text()='Open Menu']") private WebElement Menubar;
	
 public 	SwagLabHomePage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
 public void verifyLogo() {
	 
String actText =	 logo.getText();
String expText = "abcd";
if(actText.equals(expText))
{
	System.out.println("logo is correct");
}
else
{
	System.out.println("logo is not correct");
}
	
}
 
 public void clickonMenubar() {
	 Menubar.click();
	
}
	


}
