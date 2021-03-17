package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	@Given("Lauch the Browser and Open Application")
	public void lauch_the_browser_and_open_application() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");	    
	}

	@When("User enter Valid credentials {string} and {string}")
	public void user_enter_valid_credentials_and(String userid, String password) {
		driver.findElement(By.id("email")).sendKeys(userid);
		driver.findElement(By.id("passwd")).sendKeys(password);
	    
	}
	@Then("User Must be in Login Page")
	public void user_must_be_in_login_page() {
		driver.findElement(By.id("SubmitLogin")).click();
	
	}
}
