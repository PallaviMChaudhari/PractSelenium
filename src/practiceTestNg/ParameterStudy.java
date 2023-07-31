package practiceTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterStudy {
	WebDriver driver;
  @Parameters("BrowName")
  @Test
  public void fb(String bname) {
	  
	  if(bname.equals("chrome")) {
		  driver=new ChromeDriver();
		 
	  }
	  else if(bname.equals("edge")) {
		  driver=new EdgeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
  }
}
