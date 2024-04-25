package Stepdef;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Excel.Details;
import PF.Pf_04;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_04 {
	
	WebDriver driver;
	Pf_04 log;
	List<WebElement> prices;
	ArrayList<Double>bprice;
	Details ex=new Details();

	
	@Given("User should be able to lauch the saucelab")
	public void user_should_be_able_to_lauch_the_saucelab() {
		System.setProperty("webdriver.edge.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\Demosite\\Driver\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com");
	}

	@When("User should enters the username and password")
	public void user_should_enters_the_username_and_password() throws InterruptedException, IOException {
		log = new Pf_04(driver);
	    log.Login_detail();
	    
	}
	
	//By using sort and assertion method to validate the sorted item
	@And("User should be able to select filter button")
	public void user_should_be_able_to_select_filter_button() {
	
		bprice=new ArrayList<Double>();
		prices=log.price;
		for(WebElement we:prices)
		{
			bprice.add(Double.valueOf(we.getText().replace("$", "")));
		}
		System.out.println(bprice);
		Collections.sort(bprice);

		Select s=new Select(driver.findElement(By.className("product_sort_container")));
	    s.selectByVisibleText("Price (low to high)");
	
	}

	@And("User should be able to view the sort items")
	public void user_should_be_able_to_view_the_sort_items() {
	   
	    ArrayList<Double>aPrice=new ArrayList<Double>();
		prices=log.price;
		for(WebElement p:prices)
		{
			aPrice.add(Double.valueOf(p.getText().replace("$", "")));
		}
		System.out.println(aPrice);
		 Assert.assertEquals(bprice, aPrice);
	    
	}

	@And("User should add multiple products")
	public void user_should_add_multiple_products(){
	    log.add_product();
	}

	@And("User should be displayed with cart")
	public void user_should_be_displayed_with_cart() {
	   log.cart_icon();
	}

	@And("User should be able to click on checkout button")
	public void user_should_be_able_to_click_on_checkout_button(){
      log.checkout_page();
    }

	@And("User should be able to enter firstname,lastname,zip code")
	public void user_should_be_able_to_enter_firstname_lastname_zip_code() throws InterruptedException, IOException {
	    log.details();
	}

	@And("User should be able to click on continue")
	public void user_should_be_able_to_click_on_continue(){
	    log.continue_button();
	}

	@And("User should be able to click on finish")
	public void user_should_be_able_to_click_on_finish()  {
		log.Finish_button();
	}

	//Method to display the order message by using screenshot
	@And("User should be displayed with order placed message")
	public void user_should_be_displayed_with_order_placed_message() throws IOException {

		TakesScreenshot sc=(TakesScreenshot)driver;
		File Src=sc.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/scr1.png");
		FileUtils.copyFile(Src,dst);
	}

	@Then("User should be back to home page")
	public void user_should_be_back_to_home_page() {
	   log.backhome_button();
	   driver.quit();
	}


}
