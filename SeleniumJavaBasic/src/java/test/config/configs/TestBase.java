package configs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
  protected static WebDriver  driver;
  
  public static void initialization() {
	  driver=new ChromeDriver();
	  driver.get("https://google.com");
  }
  
  
}
