package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group1 {
  @Test(groups = "sanity")
  public void A() {
	  Reporter.log("A is running", true);
  }
  @Test(groups = "regression")
  public void B() {
	  Reporter.log("B is running", true);
  }
  @Test(groups = "sanity")
  public void C() {
	  Reporter.log("C is running", true);
  }
  @Test(groups = "sanity")
  public void D() {
	  Reporter.log("D is running", true);
  }
}
