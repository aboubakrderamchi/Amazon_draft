package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.GetDataFromProperties;

public class LoginPage extends GetDataFromProperties{
	String userName = getUsername();
	String pwd = getPwd();
	WebDriver driver;
	
	@FindBy (xpath = "//input[@id=\"ap_email\"]") WebElement username;
	@FindBy (xpath= "//input[@id=\"continue\"]") WebElement continueButton;
	@FindBy (xpath = "//input[@id=\"ap_password\"]") WebElement pss;
	@FindBy (xpath= "//input[@id=\"signInSubmit\"]") WebElement signInButton;


	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void insertUserName() {
		username.sendKeys(userName);
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public void insertPwd() {
		pss.sendKeys(pwd);
	}
	public void clickOnSignInButton() {
		signInButton.click();
	}

	
	
	
}
