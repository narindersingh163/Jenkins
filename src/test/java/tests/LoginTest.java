package tests;

import org.testng.annotations.Test;

import TestBase.Driver;
import pages.HomePage;
import utilities.TestUtilities;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	private Driver tb;
	private WebDriver driver;
	private HomePage homePage;

	@Test(description = "Just getting the url of the page", priority = 1, groups = "Sanity")
	public void refreshPage() {
		Reporter.log(homePage.getUrl());
		TestUtilities.attachScreenShot(driver);
		Assert.assertEquals(true, true);
	}
	
	@Test(description = "Wrong Credentials", priority = 2, groups = "Sanity")
	public void loginWrong() {
		homePage.enterUsername("username");
		homePage.enterPassword("password");
		TestUtilities.attachScreenShot(driver);
		homePage.logIn();
		WebElement errorElement = homePage.getErrorElement();
		TestUtilities.waitForVisible(errorElement, driver);
		TestUtilities.attachScreenShot(driver);
		Assert.assertEquals(errorElement.isDisplayed(), true);
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		tb = new Driver();
		driver = tb.getDriver();
		homePage = new HomePage(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		driver.quit();
	}

}
