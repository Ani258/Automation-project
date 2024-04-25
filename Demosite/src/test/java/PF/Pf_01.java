package PF;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Excel.Details;
import Genericfunction.GenericLogin;

public class Pf_01 {

	@FindBy(id="user-name") WebElement login_user;
	@FindBy(id="password") WebElement login_password;
	@FindBy(css="#login-button") WebElement login;
	@FindBy(xpath="//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']") WebElement add_item;
	@FindBy(css=".shopping_cart_link") WebElement shopping_icon;
    @FindBy(linkText="Test.allTheThings() T-Shirt (Red)") WebElement item_display;
	
    WebDriver driver;
	//Creating object for Details class
	Details ex=new Details();
	
	//Creating object for GenericLogin class
	GenericLogin generic;
 
	//Constructor initializing driver
	public Pf_01(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		generic=new GenericLogin(driver);
		generic.ImplicitWait();
		generic.read_properties();
		
	}
	
	//Method for getting UserName
	public void username() throws IOException {
		generic.sendInput(login_user, ex.get_username());		
	}
	
	//Method for getting Password
	public void password() throws IOException{
		generic.sendInput(login_password,ex.get_password());	
	}
	
	//Method for getting login into the Website
	public void submit() {
		generic.clickWebElement(login);	
	}
	
	//Method to add the product
	public void addproduct() {
		generic.clickWebElement(add_item);
	}
	
	//Method to open the shopping cart
	public void cart_icon() {
		generic.clickWebElement(shopping_icon);
	}
	
	//Method to validate the selected product
	public void validate_item() {
		generic.Validateproduct(item_display);
		System.out.println("Selected item is present");
		
		String ExpectedText = "Test.allTheThings() T-Shirt (Red)";
		generic.Validateproduct(item_display, ExpectedText);
		System.out.println("Title of the product is same");
	}
}
