package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
	
	public WebDriver driver;
	public String browser;
	public String url;
	public Properties prop;
	
	public WebDriver getDriver() {
		try (FileInputStream fis = new FileInputStream(new File("./src/main/java/config/Configurations"))){
			prop = new Properties();
			prop.load(fis);
			browser = prop.getProperty("browser");
			url = prop.getProperty("url");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(); 
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(); 
		}else if(browser.equalsIgnoreCase("safari")){
			driver = new SafariDriver(); 
		}else {
			Throwable thr = new Throwable();
			thr.initCause(thr);
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}
