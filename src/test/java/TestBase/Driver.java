package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		return driver;
	}

}
