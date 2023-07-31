package practiceTestNg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;
	
	public void lanuchBwroser() throws IOException {
		driver=new ChromeDriver();
		driver.get(Utility.getDataFromProperty("Url"));
		driver.manage().window().maximize();
	}
	
	public void closeBrowser() throws InterruptedException {
		Utility.waitTime(5000);
		driver.quit();
	}

}
