package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	private WebDriver dr;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.dr = driver;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement enterIdField;
	
	
	public boolean isEnterIdDisplayed() {
		return enterIdField.isDisplayed();
	}

}
