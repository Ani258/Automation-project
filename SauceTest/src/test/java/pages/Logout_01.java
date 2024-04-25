package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Generic;

public class Logout_01 extends Generic {
	WebDriver driver;
	@FindBy(css="#react-burger-menu-btn")WebElement openMenuButton;
	@FindBy(xpath="//a[text()='Logout']")WebElement logoutButton;
	@FindBy(css="#reset_sidebar_link")WebElement appReset;
	@FindBy(css=".shopping_cart_badge")WebElement cartIcon;
	
	public Logout_01(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void Logout(){
		Click(openMenuButton);
		VisibilityOfElement(appReset);
		Click(appReset);
		VisibilityOfElement(logoutButton);
		Click(logoutButton);
	}
}
