package Step_definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactory.SignPF;
import io.cucumber.java.en.*;

public class Signupstep {

	WebDriver driver=new ChromeDriver();
	SignPF log =PageFactory.initElements(driver,SignPF.class);
    
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver.get("https://www.apollo247.com/");
		
        log.nt();

	}

	@When("user click on login\\/sign up popup")
	public void user_click_on_login_sign_up_popup() {
	  log.popup(); 

	}

	@And("user enter mobile number")
	public void user_enter_mobile_number() throws InterruptedException {
	  log.mb(); 
	  Thread.sleep(6000);	
	}

	@And("click on arrow button")
	public void click_on_arrow_button() throws InterruptedException {
	  log.ar();
	  Thread.sleep(15000);	
	}

	@And("After entering OTP click on arrow button")
	public void after_entering_otp_click_on_arrow_button() throws InterruptedException {
	  log.af();
	  Thread.sleep(4000);
		
	  
	}

	@And("user enters first name and last name and dateofbirth and gender and email and refferal code")
	public void user_enters_first_name_and_last_name_and_dateofbirth_and_gender_and_email_and_refferal_code() throws AWTException {
	  
		 Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		  log.fn();
		  robot.keyPress(KeyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB);
		  log.ln();
		  robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		  log.dob();
		  robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		  log.gender();
		  robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		  log.email();
		  robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		  log.rc();
		
		
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() throws IOException {
	   log.sub(); 
	   Screen.CaptureScreenshot(driver,"uploadwarning");
	
	}
     
	}


