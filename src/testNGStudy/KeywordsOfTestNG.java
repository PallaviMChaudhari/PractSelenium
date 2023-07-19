package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordsOfTestNG {
  @Test(priority = 3)
  public void riddhi() {
	  Reporter.log("My name is Riddhi",true);
  }
  @Test(invocationCount = 2)
  public void kalyani() {
	  Reporter.log("My name is kalyani",true);
  }
  @Test(dependsOnMethods = {"pallavi","riddhi"})
  public void priya() {
	  Reporter.log("My name is priya",true);
  }
  @Test(timeOut = 1000)
  public void pallavi() {
	  Reporter.log("My name is pallavi",true);
  }
}
