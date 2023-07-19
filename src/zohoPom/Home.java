package zohoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(xpath = "//div[@class='ztb-profile-container ztb-profile-image-pre']")private WebElement myProfile;
	@FindBy(xpath = "//a[text()='My Account']")private WebElement myAccount;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnMyProfile() {
		myProfile.click();
	}
	
	public void clickOnMyAccount() {
		myAccount.click();
	}


}
