package pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_inpf {

	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Sign in'][1]") WebElement signin;
	@FindBy(id="user_email_login") WebElement mail;
	@FindBy(id="user_password") WebElement pass;
	@FindBy(id="accept-cookie-notification") WebElement cookies;
	@FindBy(id="user_submit") WebElement submit;
	
	public Sign_inpf(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void sign() {
		signin.click();
	}
	public void mailid() {
		mail.sendKeys("anitharadha20@gmail.com");
	}
	public void password() {
		pass.sendKeys("Anitha");
	}
	public void acceptcookies() {
		cookies.click();
	}
    public void submitbtn() {
    	submit.click();
    }
    
}
