package Stepdef;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import com.google.common.base.Function;
import Genericfunction.GenericLogin;
import PF.Pf_05;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Scenario_05 {
	
	WebDriver driver;
	Pf_05 log;
	List<WebElement> price;
	ArrayList<String>beforeprice;
	WebElement p1,e;
	GenericLogin generic=new GenericLogin(driver);
	
	
	@Given("User should be able to lauch the website")
	public void user_should_be_able_to_lauch_the_website() {
		System.setProperty("webdriver.edge.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\Demosite\\Driver\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com"); 
	}

	@When("User should enters the login credentials")
	public void user_should_enters_the_login_credentials() throws IOException {
		log = new Pf_05(driver);
	    log.Login_detail();   
	}

	//By using sort and assertion method to view the sorted item
	@And("User should be able to select filter")
	public void user_should_be_able_to_select_filter() {
	
		beforeprice=new ArrayList<String>();
		price=log.price;
		for(WebElement we:price)
		{
			beforeprice.add(we.getText());
		}
		System.out.println(beforeprice);
		Collections.sort(beforeprice);
		Collections.reverse(beforeprice);

		Select s=new Select(driver.findElement(By.className("product_sort_container")));
	    s.selectByVisibleText("Name (Z to A)");
	}

	@And("User should be able to view the sorted product")
	public void user_should_be_able_to_view_the_sorted_product() {
	
		ArrayList<String> afterPrice=new ArrayList<String>();
		price=log.price;
		for(WebElement p:price)
		{
			afterPrice.add(p.getText());
		}
		System.out.println(afterPrice);
		Assert.assertEquals(beforeprice,afterPrice);    
	}
	   
	@And("User should be able to add multiple products")
	public void user_should_be_able_to_add_multiple_products() {
	    log.addcart();
	}

	@And("User should be able to view added items")
	public void user_should_be_able_to_view_added_items() {
		log.validate_items();    
	}

	//Fluent wait
	@And("User should be able to click on reset the cart")
	public void user_should_be_able_to_click_on_reset_the_cart() throws InterruptedException {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(30))
			  .pollingEvery(Duration.ofSeconds(5))
              .ignoring(NoSuchElementException.class);
			       	
	     WebElement a=wait.until(new Function<WebDriver, WebElement>(){
		     public WebElement apply(WebDriver driver) {
			     return driver.findElement(By.xpath("//a[text()='Reset App State']"));
			     }
			  });
	     log.open_menu();
	 } 
	 
	@And("User should be able to empty the cart")
     public void user_should_be_able_to_empty_the_cart() {
		log.reset_cart();	
	}

	@Then("User should be able to perform logout")
	public void user_should_be_able_to_perform_logout(){
	    log.logout();
	    driver.quit();
	}
}
