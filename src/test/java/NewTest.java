import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import TestBase.*;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = Driver.getDriver();
	  driver.get("https://www.facebook.com");
	  
	  try{Thread.sleep(3000);}catch(Exception e){};
	  
	  driver.close();
  }
}
