package practiceTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group1 {
  @Test(groups = "login")
  public void f() {
	  Reporter.log(" F is running",true);
  }
  @Test(groups = "signIn")
  public void g() {
	  Reporter.log(" G is running",true);
  }
  @Test(groups = "login")
  public void h() {
	  Reporter.log(" H is running",true);
  }
  @Test(groups = "login",priority = -1)
  public void i() {
	  Reporter.log(" I is running",true);
  }
  @Test(groups = "signIn")
  public void j() {
	  Reporter.log(" J is running",true);
  }
}
