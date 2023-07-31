package practiceTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywords {
  @Test(invocationCount = 3)
  public void a() {
	  Reporter.log(" A is running",true);
  }
  @Test(timeOut = 500)
  public void b() {
	  Reporter.log(" B is running",true);
  }
  @Test(dependsOnMethods = "d")
  public void c() {
	  Reporter.log(" C is running",true);
  }
  @Test(priority = -1)
  public void d() {
	  Reporter.log(" D is running",true);
  }
  @Test(enabled = false)
  public void e() {
	  Reporter.log(" E is running",true);
  }
}
