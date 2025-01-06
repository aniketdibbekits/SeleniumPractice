package POM_WITH_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[@class='app_logo']") private WebElement LOGO;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateLogo(String LogoText) {
		String logo = LOGO.getText();
		if(logo.equals(LogoText))
		{
			System.out.println("Logo text is equal");
		}
		else {
			System.out.println("Different logo text");
		}
	}

}
