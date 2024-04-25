package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Generic;

public class Login_01 extends Generic {
	WebDriver driver;
	@FindBy(id="user-name")WebElement login_user;
	@FindBy(id="password")WebElement login_password;
	@FindBy(css="#login-button")WebElement login;
	
    public Login_01(WebDriver driver) {
    	super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
    public void Login() {
    	login_user.sendKeys("standard_user");
    	login_password.sendKeys("secret_sauce");
    	Click(login);
    }
}   
