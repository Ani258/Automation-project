package PF;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.Details;
import Genericfunction.GenericLogin;

public class Pf_02 {

	@FindBy(id="user-name") WebElement login_user;
	@FindBy(id="password") WebElement login_password;
	@FindBy(css="#login-button") WebElement login;
	@FindBy(name="add-to-cart-sauce-labs-bolt-t-shirt") WebElement add_item;
	@FindBy(css=".shopping_cart_link") WebElement shopping_icon;
	@FindBy(xpath="//button[@id='continue-shopping']") WebElement next_button;
	@FindBy(linkText="Sauce Labs Bolt T-Shirt") WebElement selected_item;
	@FindBy(xpath="//span[text()='Products']") WebElement home_page;
	@FindBy(className="inventory_item_price") WebElement price;
	
	WebDriver driver;
	//Creating object for Details class
    Details ex=new Details();
	
    //Creating object for GenericLogin class
	GenericLogin generic;
 
	//Constructor initializing driver
	public Pf_02(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		generic=new GenericLogin(driver);
	}
	
	//Method for getting UserName
	public void username() throws IOException  {
		generic.sendInput(login_user, ex.get_username());	
	}
	
	//Method for getting Password
	public void password() throws IOException {
		generic.sendInput(login_password,ex.get_password());
	}
	
	//Method for getting login into the Website
	public void submit()  {
		generic.clickWebElement(login);
	}
	
	//Method to add the product
	public void addproduct()  {
		generic.clickWebElement(add_item);	
	}
	
	//Method to open the shopping cart
	public void cart_icon() {
		generic.clickWebElement(shopping_icon);
	}
	
	//Method to click the continue button
	public void continue_shopping() {
		generic.clickWebElement(next_button);
	}
	
	//Method to validate the selected product
	public void selected_product() {
		generic.Validateproduct(selected_item);
		System.out.println("Selected item is displayed ");
		
		String ExpectedText = "$15.99";
		generic.Validateproduct(price, ExpectedText);
		System.out.println("Price of the product is same");
	}
	
	//Method to validate that HomePage is displayed
	public void navigate_homepage() {
		generic.Validateproduct(home_page);
		System.out.println("Home page is displayed ");
	}
}

	

