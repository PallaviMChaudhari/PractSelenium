package zohoPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	static protected WebDriver driver;
	
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/login.html");
		Reporter.log("Browser Launch successfully.. ", true);
	}
	
	public void launchBrowserProp() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility.readDataFromProperties("Url"));
		Reporter.log("Browser Launch successfully.. ", true);
	}
	
	public void closeBrowser() {
		Reporter.log("Close browser window....",true);
		driver.quit();
	}
	

}
