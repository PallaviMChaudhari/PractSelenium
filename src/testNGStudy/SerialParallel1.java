package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SerialParallel1 {
  @Test
  public void fb() {
	  Reporter.log("fb is running", true);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
  }
  
}
