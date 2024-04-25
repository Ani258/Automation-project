package PF;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Excel.Details;
import Genericfunction.GenericLogin;

public class Pf_04 {

	@FindBy(id="user-name") WebElement login_user;
	@FindBy(id="password") WebElement login_password;
	@FindBy(css="#login-button") WebElement login;
	@FindBy(name="add-to-cart-sauce-labs-onesie") WebElement product1 ;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bike-light']") WebElement product2 ;
	@FindBy(css=".shopping_cart_link") WebElement shopping_icon;
	@FindBy(css=".inventory_item_price")
	public List<WebElement> price;
	@FindBy(xpath="//button[text()='Checkout']") WebElement checklist;
	@FindBy(css="#first-name") WebElement detail_firstname;
	@FindBy(css="#last-name") WebElement detail_lastname;
	@FindBy(css="#postal-code") WebElement detail_zipcode;
	@FindBy(name="continue") WebElement continue_box;
	@FindBy(xpath="//button[text()='Finish']") WebElement finish_page;
	@FindBy(xpath="//button[text()='Back Home']") WebElement backhome;
	
	WebDriver driver;
	//Creating object for Details class
    Details ex=new Details();
	
    //Creating object for GenericLogin class
	GenericLogin generic;
	 
	//Constructor initializing driver
	public Pf_04(WebDriver driver) {
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
	public void add_product() {
		generic.clickWebElement(product1);
		generic.clickWebElement(product2);
	}

	//Method to open the shopping cart
	public void cart_icon() {
		generic.clickWebElement(shopping_icon);
	}

	//Method to open checkout page
	public void checkout_page() {
		generic.clickWebElement(checklist);
	}
	
	//Method to getting the FirstName,LastName and ZipCode
	public void details() throws InterruptedException, IOException {
		generic.sendInput(detail_firstname, ex.get_firstname());
		generic.sendInput(detail_lastname,ex.get_lastname());
		generic.sendInput(detail_zipcode,String.valueOf(ex.get_pincode()));
		Thread.sleep(1000);
	}
	
	//Method to click continue button
	public void continue_button(){
		generic.clickWebElement(continue_box);
	}
	
	//Method to click finish button
	public void Finish_button() {
		generic.clickWebElement(finish_page);
	}
	
	//Method to navigate the home page
	public void backhome_button() {
		generic.clickWebElement(backhome);
	}
}
