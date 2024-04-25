package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Negative_cases {
	WebDriver driver= new ChromeDriver();
 
	@Given("User should login and navigate to the home page")
	public void user_should_login_and_navigate_to_the_home_page() {
		driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();  
	}

	@When("user enters login credentialsname1 and standard")
	public void user_enters_login_credentialsname1_and_standard(String username,String password) {
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
	 
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() {
	    driver.findElement(By.className("submit-button btn_action")).click();
	    driver.quit();
	}

	@When("user enters login credentialsstandard_user and secret_sauce")
	public void user_enters_login_credentialsstandard_user_and_secret_sauce(String username,String password) {
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.className("submit-button btn_action")).click();
	   driver.quit();
	}

	@When("user enters login credentialsstandard_user and -")
	public void user_enters_login_credentialsstandard_user_and(String username,String password) {
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.className("submit-button btn_action")).click();
	    
	}
}
