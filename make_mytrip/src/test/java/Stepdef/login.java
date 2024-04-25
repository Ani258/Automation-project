package Stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
    
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
	
	@Given("user is logged in")
	public void user_is_logged_in() {
	    System.out.println("abc");
	}

	@When("user clicks on ‘Add to Cart’ button")
	public void user_clicks_on_add_to_cart_button() {
	    System.out.println("add");
	}

	@Then("product is displayed in the cart")
	public void product_is_displayed_in_the_cart() {
	   System.out.println("display");
	}

	@Given("I want to check the username with standard_user")
	public void i_want_to_check_the_username_with_standard_user() {
	   System.out.println("check");
	}

	@Then("I check for the password with secret_sauce")
	public void i_check_for_the_password_with_secret_sauce() {
	  System.out.println("pass");
	}

	@Given("I want to check the username with locked_out_user")
	public void i_want_to_check_the_username_with_locked_out_user() {
	    System.out.println("user2");
	}

}
