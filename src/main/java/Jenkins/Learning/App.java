package Jenkins.Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		dr.close();
	}
}
