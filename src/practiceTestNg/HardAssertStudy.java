package practiceTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertStudy {
	SoftAssert s=new SoftAssert();
  @Test
  public void f() {
	  
	  String str1 ="pallavi";
	  String str2 ="pallavi";
	  //String str3 ="moksh" ;
	  
	 s.assertEquals(str1, str2,"tc fail bcoz string not match");
	  
	 s.assertNotEquals(str1, str2,"tc fail bacoz tc match");
	  
	 s.assertEquals(str1, str2,"tc fail bcoz string not match");
	  Reporter.log("hii my name is pallavi",true);
	  
	  s.assertAll();
	  
	  
  }
  @Test
  public void g() {
	  
	  String str1 =null;
	  String str2 ="pallavi";
	  
	  
	  Assert.assertNull(str1,"tc fail bcoz string not match");

	  Assert.assertNotNull(str2,"tc fail bacoz tc match");
	  
	  
  }
  @Test
  public void h() {
	  
	  boolean a=true;
	  boolean b=false;
	  Assert.assertTrue(a,"tc fail bcoz string not match");

	  Assert.assertFalse(b,"tc fail bacoz tc match");
	  
	  
  }
}
