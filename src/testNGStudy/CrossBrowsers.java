package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowsers {
	 WebDriver driver;
  
  @Parameters("browserName")
  @Test
  public void f(String bName) {
	   
      if(bName.equals("chrome")) {
    	  driver=new ChromeDriver();
      }
      else if(bName.equalsIgnoreCase("edge")) {
    	  driver=new EdgeDriver();  
      }
      driver.get("https://www.instagram.com/");
      driver.manage().window().maximize();
  }
}
