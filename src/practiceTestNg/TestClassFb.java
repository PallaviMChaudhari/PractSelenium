package practiceTestNg;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (practiceTestNg.Listener.class)
public class TestClassFb extends Base{

	POM p;
  @Test
  public void f() throws IOException, InterruptedException {
	  lanuchBwroser();
	  Utility.waitTime(4000);
	  p=new POM(driver);
	  p.enterValueEmailId();
	  Utility.waitTime(4000);
	  p.enterPass();
	  Utility.waitTime(4000);
	  Utility.getScreenshot(driver, "abc");
	  
	  Utility.waitTime(4000);
	  closeBrowser();
	  
	  
  }
}
