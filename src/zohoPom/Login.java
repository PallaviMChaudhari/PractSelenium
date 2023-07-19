package zohoPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath = "(//a[text()='SIGN IN'])[2]") private WebElement signInButton;
	@FindBy(name  = "LOGIN_ID") private WebElement userNameField;
	@FindBy(id = "nextbtn")private WebElement nextButton;
	@FindBy(xpath = "//input[@name='PASSWORD']")private WebElement password;
	@FindBy(xpath = "(//span[text()='Sign in'])[2]")private WebElement signInOnPWD;
	@FindBy(id = "skip")private WebElement skipButton;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn() {
		signInButton.click();
	}
	
	public void enterMobileIntoField() throws IOException {
		userNameField.sendKeys(Utility.readDataFromProperties("UN"));
	}
	
	public void clickOnNext() {
		nextButton.click();
	}
	
	public void enterPWD() throws IOException {
		password.sendKeys(Utility.readDataFromProperties("PWD"));
	}
	public void clickONSignInOnPWD() {
		signInOnPWD.click();
	}
	
	public void clickOnskipButton() {
		skipButton.click();
	}

}
