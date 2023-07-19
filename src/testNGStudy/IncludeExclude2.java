package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExclude2 {
  @Test
  public void E() {
	  Reporter.log("E is running", true);
  }
  @Test
  public void F() {
	  Reporter.log("F is running", true);
  }
  @Test
  public void G() {
	  Reporter.log("G is running", true);
  }
  @Test
  public void H() {
	  Reporter.log("H is running", true);
  }
}
