package Stepdef;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import Genericfunction.GenericLogin;
import PF.Pf_03;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_03 {

	WebDriver driver;
	Pf_03 log;
	GenericLogin generic=new GenericLogin(driver);
	
	@Given("User should be able to lauch the saucelab demosite")
	public void user_should_be_able_to_lauch_the_saucelab_demosite(){
		System.setProperty("webdriver.edge.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\Demosite\\Driver\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com");   
	}

	@When("User should enters the username")
	public void user_should_enters_the_username() throws IOException {
		log = new Pf_03(driver);
	    log.username(); 
	}

	@And("User should enters the password")
	public void user_should_enters_the_password() throws IOException  {
		log.password();   
	}

	@And("User should be able to login the home page")
	public void user_should_be_able_to_login_the_home_page()  {
	    log.submit();   
	}

	@And("User should add 3rd product to the cart")
	public void user_should_add_3rd_product_to_the_cart()  {
	    log.addproduct1();   
	}

	@And("User should add 1st product to the cart")
	public void user_should_add_1st_product_to_the_cart() {
	    log.addproduct2();   
	}

	@And("User navigates to cart page")
	public void user_navigates_to_cart_page(){
	    log.cart_icon();   
	}

	@And("User should be able to view the selected item in the cart")
	public void user_should_be_able_to_view_the_selected_item_in_the_cart() {
		log.validate_product();   
	}

	@And("User should be able to click on remove button of 2nd product from the cart")
	public void user_should_be_able_to_click_on_remove_button_of_2nd_product_from_the_cart() {
	    log.remove_button();    
	}

	@Then("User should be able to remove 2nd item from the cart")
	public void user_should_be_able_to_remove_2nd_item_from_the_cart() {
		log.remove_product();
		driver.quit();
	}
}
