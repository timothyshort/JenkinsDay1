package sdettraining;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

	private String rootDir = "C:\\HexawareTraining\\Materials\\Software\\Selenium-BDD";
	private String browserDriver = "geckodriver.exe";

	private WebDriver driver;
	private String email = "rachel.simmons@testemail.com";
	private String password = "password";


	@Before
	public void setUp() throws Exception {
		// Initialize the Driver
		System.setProperty("webdriver.gecko.driver", rootDir + "\\" + browserDriver);
		driver = new FirefoxDriver();
		System.out.println("Starting web browser");
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		Thread.sleep(1500);
	}

	@After
	public void tearDown() throws Exception {
		// Close the Driver
		driver.quit();
	}

	@Test
	public void loginTest() throws InterruptedException {
		String pageTitle = driver.getTitle();
		Assert.assertTrue("Login Page Title Checkpoint", pageTitle.contains("SDET"));

		// Implement the UI test steps
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.id("MainContent_btnLogin")).click();
		Thread.sleep(1500);

		// Assert a correct login
		String pageText = driver.findElement(By.xpath("html/body")).getText();
		Assert.assertTrue("Login Message Present", pageText.contains("Logged in successfully"));
	}
}
