package practiceTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	@FindBy (name = "email")private WebElement emailId;
	@FindBy (name = "pass")private WebElement Pwd;
	
	
	public POM(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	public void enterValueEmailId() {
		emailId.sendKeys("pallavichaudhari@gmail.com");
	}
	
	public void enterPass() {
		Pwd.sendKeys("123456");
	}

}
