package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group2 {
  @Test(groups = "regression")
  public void E() {
	  Reporter.log("E is running", true);
  }
  @Test(groups = "sanity")
  public void F() {
	  Reporter.log("F is running", true);
  }
  @Test(groups = "sanity")
  public void G() {
	  Reporter.log("G is running", true);
  }
  @Test(groups = "regression")
  public void H() {
	  Reporter.log("H is running", true);
  }
}
