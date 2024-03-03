package steps;

import java.util.concurrent.TimeUnit;

//import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
//import utilities.TestBase;
import utilities.*;
public class Parfum extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	String url = GetDataFromProperties.getUrl();


	@Before
	public void beforeRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Given("User is on Amazon Page")
	public void UserIsOnAmazonPage() {
		driver.get(url);
	}
	
	@When("User enters username")
	public void UserEntersUsername() {
		loginPage.insertUserName();
	}
	@Then("User click on continue button")
	public void UserClickonContinueButton() {
		loginPage.clickOnContinueButton();
	}
	@When("User enters password")
	public void UserEntersPassword() {
		loginPage.insertPwd();
	}
	@And("User click on sign in button")
	public void UserClickonSignInButton() {
		loginPage.clickOnSignInButton();
	}
	
	@Then("Get title")
		public void getTitle(){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println("*************"+title);
		}
		
	
	@Then("User should be able to land on the homepage")
	public void UserClickOnSignInButton() {
	}
}
