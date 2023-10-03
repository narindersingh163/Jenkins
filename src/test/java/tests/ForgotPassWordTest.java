package tests;

import org.testng.annotations.Test;

import TestBase.Driver;
import pages.ForgotPasswordPage;
import pages.HomePage;
import utilities.TestUtilities;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;

public class ForgotPassWordTest {

	private Driver tb;
	private WebDriver driver;
	private HomePage homepage;
	private ForgotPasswordPage forgotPasswordPage;

	@Test(description = "Checking if the forgot password page displays the box to enter username", priority = 3,
			groups = "Sanity")
	public void forgotPasswordTest() throws InterruptedException {
		Reporter.log("The current url is: " + driver.getCurrentUrl() + " and the title is: " + driver.getTitle());
		TestUtilities.attachScreenShot(driver);
		homepage.clickForgotPassword();
		Thread.sleep(1000);
		Reporter.log("The current url is: " + driver.getCurrentUrl() + " and the title is: " + driver.getTitle());
		TestUtilities.attachScreenShot(driver);
		Assert.assertEquals(forgotPasswordPage.isEnterIdDisplayed(), true);
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		tb = new Driver();
		driver = tb.getDriver();
		homepage = new HomePage(driver);
		forgotPasswordPage = new ForgotPasswordPage(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.quit();
	}

}
