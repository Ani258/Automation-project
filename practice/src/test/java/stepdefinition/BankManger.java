package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testpages.CreateCustomer;

public class BankManger {
	
	public static WebDriver driver;
	CreateCustomer bank;
		
	@Given("user should on login page")
	public void user_should_on_login_page() {
		driver=new EdgeDriver();
		bank=new CreateCustomer(driver);
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		
		
	  //  launchBrowser();  
	}

	@When("user should navigate to bank manager login page")
	public void user_should_navigate_to_bank_manager_login_page() {
	    bank.LoginBankMangaer();
	}

	@And("user should add customer details and validate the newly added customer")
	public void user_should_add_customer_details_and_validate_the_newly_added_customer() {
	    bank.NewCustomer();
	}

	@And("user should select the added customer in open account field and validate it")
	public void user_should_select_the_added_customer_in_open_account_field_and_validate_it() {
	   bank.CheckAccount(); 
	}

	@And("user should search the customer in customers field")
	public void user_should_search_the_customer_in_customers_field() {
	   bank.SearchCustomer(); 
	}

	@Then("Delete the customer")
	public void delete_the_customer() {
	   bank.Deletecustomer();
	}
}
