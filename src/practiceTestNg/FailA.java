package practiceTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailA {
  @Test
  public void f() {
	  Reporter.log(" F is running",true);
  }
  @Test
  public void g() {
	  
	  Reporter.log(" G is running",true);
  }
  @Test
  public void h() {
	  Reporter.log(" H is running",true);
  }
  @Test
  public void i() {
	  
	  Reporter.log(" I is running",true);
  }
  @Test
  public void j() {
	  Reporter.log(" J is running",true);
  }
}
