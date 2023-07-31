package practiceTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(practiceTestNg.Listener.class)
public class DataProvider {
  @Test(dataProvider = "FbData",dataProviderClass = practiceTestNg.ProviderClass.class)
  public void f(String Id,String ps) {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	  WebElement userId = driver.findElement(By.name("email"));
	  userId.sendKeys(Id);
	  WebElement pwd = driver.findElement(By.name("pass"));
	  pwd.sendKeys(ps);
	  
  }
}
