package practiceTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group2 {
  @Test(groups = "signIn")
  public void a() {
	  Reporter.log(" A is running",true);
  }
  @Test(groups = "signIn")
  public void b() {
	  Reporter.log(" B is running",true);
  }
  @Test(groups = "login")
  public void c() {
	  Reporter.log(" C is running",true);
  }
  @Test(groups = "login")
  public void d() {
	  Reporter.log(" D is running",true);
  }
  @Test(groups = "signIn")
  public void e() {
	  Reporter.log(" E is running",true);
  }
}
