package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.pom4;

public class step4 {
	WebDriver driver;
	pom4 log;
	
	@Given("User should be able to lauch the saucelab")
	public void user_should_be_able_to_lauch_the_saucelab() {
		System.setProperty("webdriver.edge.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\Demosite\\Driver\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com");
	}

	@When("User should enters the username and password")
	public void user_should_enters_the_username_and_password() {
		log = new pom4();
	}

	@And("User should be able to view the sort items")
	public void user_should_be_able_to_view_the_sort_items() {
	  
	}

	@And("User should add multiple products")
	public void user_should_add_multiple_products() {
	   
	}

	@And("User should be displayed with cart")
	public void user_should_be_displayed_with_cart() {
	   
	}

	@And("User should be able to click on checkout button")
	public void user_should_be_able_to_click_on_checkout_button() {
	   
	}

	@And("User should be able to enter firstname,lastname,zip code")
	public void user_should_be_able_to_enter_firstname_lastname_zip_code() {
	    
	}

	@And("User should be able to click on continue")
	public void user_should_be_able_to_click_on_continue() {
	    
	}

	@And("User should be able to click on finish")
	public void user_should_be_able_to_click_on_finish() {
	    
	}

	@And("User should be displayed with order placed message")
	public void user_should_be_displayed_with_order_placed_message() {
	   
	}

	@Then("User should be back to home page")
	public void user_should_be_back_to_home_page() {
	   
	}


}
