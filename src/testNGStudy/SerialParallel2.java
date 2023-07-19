package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SerialParallel2 {
	@Test
	  public void insta() {
		  Reporter.log("insta is running", true);
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.instagram.com/");
		  driver.manage().window().maximize();
	  }
}
