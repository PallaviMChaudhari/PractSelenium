
package testNGStudy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  SoftAssert s=new SoftAssert();
  @Test
  public void f() {
	  String str1="pallavi";
	  String str2="pallavi";
	  String str3=null;
	  
	  Assert.assertEquals(str1, str2,"tc fail str not match..");
	  
	  Assert.assertNull(str2,"tc fail str is not null");
	  
	  Assert.assertNull(str3,"tc fail str is not null");
	  
	  s.assertAll();
  }
}
