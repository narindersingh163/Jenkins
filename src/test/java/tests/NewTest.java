package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import TestBase.*;

public class NewTest {
	@Test
	public void f() {
		WebDriver driver = Driver.getDriver();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
		
		
		driver.close();
	}
}
