package practiceTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExclude2 {
  @Test(invocationCount = 3)
  public void f() {
	  Reporter.log(" F is running",true);
  }
  @Test(timeOut = 500)
  public void g() {
	  Reporter.log(" G is running",true);
  }
  @Test
  public void h() {
	  Reporter.log(" H is running",true);
  }
  @Test(priority = -1)
  public void i() {
	  Reporter.log(" I is running",true);
  }
  @Test(enabled = false)
  public void j() {
	  Reporter.log(" J is running",true);
  }
}
