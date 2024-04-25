package Stepdef;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import PF.Pf_02;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_02 {
	
	WebDriver driver;
	Pf_02 log;
	
	@Given("User should be able to lauch the saucelab page")
	public void user_should_be_able_to_lauch_the_saucelab_page() {
		System.setProperty("webdriver.edge.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\Demosite\\Driver\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com"); 
	}

	@When("User should be able to give the username")
	public void user_should_be_able_to_give_the_username() throws IOException  {
		log = new Pf_02(driver);
	    log.username();
	    
	}

	@And("User should be able to give the password")
	public void user_should_be_able_to_give_the_password() throws IOException {
		log.password();
	    
	}

	@And("User should be able to login the Swag labs")
	public void user_should_be_able_to_login_the_swag_labs() {
	    log.submit();
	    
	}

	@And("User should be able to add 3rd product to the cart")
	public void user_should_be_able_to_add_3rd_product_to_the_cart(){
	    log.addproduct();
	    
	}

	@And("User should be navigate to cart page")
	public void user_should_be_navigate_to_cart_page() {
	    log.cart_icon();
	    
	}
	
	@And("User should be able to view the selected item in the cart and price must be same as it is displaye in home page")
	public void user_should_be_able_to_view_the_selected_item_in_the_cart_and_price_must_be_same_as_it_is_displaye_in_home_page() {
		log.selected_product(); 
	}

	@And("User should be able to click on Continue shopping button")
	public void user_should_be_able_to_click_on_continue_shopping_button() {
	    log.continue_shopping();
	    
	}
    
	@Then("User should be navigated back to home page")
	public void user_should_be_navigated_back_to_home_page() {
		log.navigate_homepage();
		driver.quit();
     }
}
