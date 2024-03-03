package utilities;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

	
	public static WebDriver driver;
	
	public static void init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		implicWait();		
	}
	
	
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	
	public static void implicWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void validateElement(String msg, WebElement element, String expected) {
		Assert.assertEquals(element.getText(), expected);
	}
	public static void validateDisplayElement(String msg, WebElement element) {
        Assert.assertTrue(element.isDisplayed());
	}

	
	
	
}
