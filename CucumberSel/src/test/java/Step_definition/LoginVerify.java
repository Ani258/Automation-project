package Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginVerify {
	WebDriver driver=new ChromeDriver();
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	
	}

	@When("user enters <username> and <password>")
	public void user_enters_username_and_password(String username, String password ) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	    
	}

	@And("click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("login-button")).click();
	    
	}

	@Then("user should navigate home page")
	public void user_should_navigate_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@id='']")).isDisplayed();
	    
	    
	    driver.close();
	}


}
