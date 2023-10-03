package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	private WebDriver dr;
	
	public HomePage(WebDriver driver) {
		this.dr = driver;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement password;
	
	@FindBy(xpath = "//button")
	private WebElement login;
	
	@FindBy(xpath = "//a[text()='Find your account and log in.']")
	private WebElement error;
	
	public String getUrl() {
		return dr.getCurrentUrl();
	}
	
	public void clickForgotPassword() {
		forgotPassword.click();
	}
	
	public void enterUsername(String s) {
		username.sendKeys(s);
	}
	
	public void enterPassword(String s) {
		password.sendKeys(s);
	}
	
	public void logIn() {
		login.click();
	}
	
	public WebElement getErrorElement() {
		return error;
	}
	
}
