package PF;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.Details;
import Genericfunction.GenericLogin;

public class Pf_05 {

	@FindBy(id="user-name") WebElement login_user;
	@FindBy(id="password") WebElement login_password;
	@FindBy(css="#login-button") WebElement login;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement product1;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement product2;
	@FindBy(css="div.inventory_item_name")
	public List<WebElement> price;
	@FindBy(xpath="//span[text()='2']") WebElement number_of_items;
	@FindBy(xpath="//button[text()='Open Menu']") WebElement menu_button;
	@FindBy(className=".shopping_cart_badge") WebElement empty_cart;
	@FindBy(xpath="//a[text()='Logout']") WebElement signout;
	
	WebDriver driver;
	//Creating object for Details class
    Details ex=new Details();
	
    //Creating object for GenericLogin class
	GenericLogin generic;
	
	//Constructor initializing driver
	public Pf_05(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		generic=new GenericLogin(driver);
	}
	
	//Method for getting UserName , Password and login to the website
	public void Login_detail() throws IOException {
		generic.sendInput(login_user, ex.get_username());
		generic.sendInput(login_password,ex.get_password());
		login.click();
	}
    
	//Method to add the products
	public void addcart() {
		generic.clickWebElement(product1);
		generic.clickWebElement(product2);
	}
	
	//Method to validate number of item in cart
	public void validate_items () {
		String ExpectedText = "2";
        generic.Validateproduct(number_of_items, ExpectedText);
		System.out.println("Number of the product in cart is same");
	}

	//Method to open menu in home page
	public void open_menu() {
		generic.clickWebElement(menu_button);	
	}
	
	//Method to validate the cart is empty , after clicking reset button
	public void reset_cart() {
		try {
            generic.clickWebElement(empty_cart);
			System.out.println("Validation Failed: Cart is not empty");
        } catch (NoSuchElementException e) {
            System.out.println("Validation Passed: Cart is empty");
        }
	}
	
	//Method to click logout
	public void logout(){
        generic.clickWebElement(signout);
	}
	
}
