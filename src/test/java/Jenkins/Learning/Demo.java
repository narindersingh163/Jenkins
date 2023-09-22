package Jenkins.Learning;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	@Test
	public void test() {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		WebElement forgotPassword = dr.findElement(By.xpath("//a[text()='Forgot password?']"));
		
		String text = forgotPassword.getText();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertEquals("Forgot password?", text);
		
		dr.close();
	}

}
