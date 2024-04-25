package Step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pf.Log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_01 {
	WebDriver driver= new ChromeDriver();
    Log lg;
   
	@Given("user should enter login credentialsname1 and standard")
	public void user_should_enter_login_credentialsname1_and_standard() {
		driver.get("https://www.saucedemo.com");
		lg=new Log(driver);
	    lg.uname();
	    lg.pword();
	}

	@Then("user should submit login button")
	public void user_should_submit_login_button() {
	    lg.enter();
	    driver.quit();
	}

	@Given("user should enter login credentialsstandard_user and secret_sauce")
	public void user_should_enter_login_credentialsstandard_user_and_secret_sauce() {
	    lg.uname();
	    lg.pword();
	    lg.enter();
	    driver.quit();
	}

	@Given("user should enter login credentialsstandard_user and -")
	public void user_should_enter_login_credentialsstandard_user_and() {
	   lg.uname();
	   lg.pword();
	   lg.enter();
	   driver.quit();
	}
}
