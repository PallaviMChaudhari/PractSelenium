package zohoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	@FindBy(xpath = "//div[@id='profile_name']")private WebElement userName;
	@FindBy(id =  "headder_thumb_pic")private WebElement logoutButton;
	@FindBy(xpath = "//div[text()=' Sign Out ']")private WebElement signOut;
	@FindBy(id = "Full_Name")private WebElement fullName;
	@FindBy(xpath = "//select[@name='country']")private WebElement country;
	public Profile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getUserName() {
		String un = userName.getText();
		return un;
	}
	
	public void clickOnLogoutButton() {
		logoutButton.click();
	}
	
	public void clickOnSignOut() {
		signOut.click();
	}
	 
	public String getFullName(){
		String name = fullName.getText();
		return name;
	}
	
	public String getCountry() {
		String cName = country.getText();
		return cName;
	}
	
	

}
