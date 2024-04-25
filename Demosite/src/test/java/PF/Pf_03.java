package PF;

import java.io.IOException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Excel.Details;
import Genericfunction.GenericLogin;

public class Pf_03 {
	
	@FindBy(id="user-name") WebElement login_user;
	@FindBy(id="password") WebElement login_password;
	@FindBy(css="#login-button") WebElement login;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']") WebElement add_item3;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']") WebElement add_item1;
	@FindBy(css=".shopping_cart_link") WebElement shopping_icon;
	@FindBy(name="remove-sauce-labs-backpack") WebElement removeproduct;
	@FindBy(linkText="Sauce Labs Bolt T-Shirt") WebElement product1;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']") WebElement product2;
	
	WebDriver driver;
	//Creating object for Details class
    Details ex=new Details();
	
    //Creating object for GenericLogin class
	GenericLogin generic;
 
	//Constructor initializing driver
	public Pf_03(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		generic=new GenericLogin(driver);
		generic.ImplicitWait();
	}
	
	//Method for getting UserName
	public void username() throws IOException  {
		generic.sendInput(login_user, ex.get_username());
	}
	
	//Method for getting Password
	public void password() throws IOException  {
		generic.sendInput(login_password,ex.get_password());
	}
	
	//Method for getting login into the WebSite
	public void submit()  {
		generic.clickWebElement(login);
	}
	
	//Method to add the product
	public void addproduct1() {
		generic.clickWebElement(add_item3);
	}
	
	//Method to add the product
	public void addproduct2(){
		generic.clickWebElement(add_item1);
	}
	
	//Method to open the shopping cart
	public void cart_icon()  {
		generic.clickWebElement(shopping_icon);
	}
	
	//Method to remove the product
	public void remove_button()  {
		generic.clickWebElement(removeproduct);
	}
	
	//Method to validate the products are displayed
	public void validate_product() {
		generic.Validateproduct(product1);
		System.out.println("Selected Product1 is displayed ");
		generic.Validateproduct(product2);
		System.out.println("Selected product2 is displayed ");
	}
	
	//Method to validate the product is removed
	public void remove_product() {
		try {
            generic.clickWebElement(product2);
			System.out.println("Validation Failed: Product still present in the cart");
        } catch (NoSuchElementException e) {
            System.out.println("Validation Passed: Product removed from the cart");
        }
	}
}
