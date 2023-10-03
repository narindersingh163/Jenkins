package utilities;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import TestBase.Driver;

public class TestUtilities extends Driver{

	public static void attachScreenShot(WebDriver driver) {
		String src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		String img = "<img src=\"data:image/png;base64,"+src+"\" height=\"600\" width=\"800\" />";
		Reporter.log(img);
	}
	
	public static void waitForVisible(WebElement ele, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static String getDate() {
		return new SimpleDateFormat("Y_MM_dd_HH_mm_s_SSS").format(new Date());
	}
}
