package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Pom_01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_01 {
	
	WebDriver driver;
	Pom_01 log;
	

	@Given("User should be able to enter the url of the website")
	public void user_should_be_able_to_enter_the_url_of_the_website() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\sauce\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/cart.html");
	    log = new Pom_01();
	    
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("User should be able to enter the username")
	public void user_should_be_able_to_enter_the_username() {
	 log.username();
	   // throw new io.cucumber.java.PendingException();
	}

	@And("User should be able to enter the password")
	public void user_should_be_able_to_enter_the_password() {
	  log.password();
	    //throw new io.cucumber.java.PendingException();
	}

	@And("User should be able to login to Swag labs home page successfully")
	public void user_should_be_able_to_login_to_swag_labs_home_page_successfully() {
	  log.submit();
	   // throw new io.cucumber.java.PendingException();
	}

	@And("User should be able to add last product to the cart")
	public void user_should_be_able_to_add_last_product_to_the_cart() {
	  log.addproduct();
	   // throw new io.cucumber.java.PendingException();
	}

	@And("User should be displayed with cart page")
	public void user_should_be_displayed_with_cart_page() {
	  log.carticon();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to view the selected item in the cart and title must be same as it is displaye in home page")
	public void user_should_be_able_to_view_the_selected_item_in_the_cart_and_title_must_be_same_as_it_is_displaye_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	} 


}
