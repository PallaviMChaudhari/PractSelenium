package zohoPom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZohoTestProp extends Base {
  Login ln;
  Home hm;
  Profile pr;
	
  @BeforeClass
  public void lanuchApp() throws InterruptedException, IOException {
	  launchBrowserProp();
	  ln=new Login(driver);
	  hm=new Home(driver);
	  pr=new Profile(driver);
	  ln.clickOnSignIn();
	  Utility.waitTime(4000);
	  ln.enterMobileIntoField();
	  Utility.waitTime(4000);
	  ln.clickOnNext();
	  Utility.waitTime(4000);
	  ln.enterPWD();
	  Utility.waitTime(4000);
	  ln.clickONSignInOnPWD();
	  Utility.waitTime(4000);
	  ln.clickOnskipButton();
	  Utility.waitTime(4000);
	  driver.navigate().refresh();
	  Utility.waitTime(4000);
	  hm.clickOnMyProfile();
	  Utility.waitTime(4000);
	  hm.clickOnMyAccount();
	  Utility.waitTime(4000); 
	  Set<String> allId = driver.getWindowHandles();
	  ArrayList<String> al=new ArrayList<>(allId);
	  driver.switchTo().window(al.get(1));
  }
  
  @Test
  public void VerifyUn() throws IOException {
	  String exp = Utility.readDataFromProperties("User");
	  String act = pr.getUserName();
	  Assert.assertEquals(exp, act,"TC is fail bcoz String not matching..."); 
  }
  

  @AfterClass
  
  public void logoutApp() throws InterruptedException {
	  Utility.waitTime(6000);
	  pr.clickOnLogoutButton();
	  Utility.waitTime(4000);
	  pr.clickOnSignOut();
	  Utility.waitTime(6000);
	  driver.quit();
	  
	  
  }
}
