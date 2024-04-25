package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Generic;

public class Add_Products extends Generic {
   WebDriver driver;
   @FindBy(xpath="//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']")WebElement add_item;
   @FindBy(css=".shopping_cart_link")WebElement shopping_icon;
   @FindBy(xpath="//button[@id='continue-shopping']") WebElement next_button;
   
   public Add_Products(WebDriver driver) {
	   super(driver);
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
   public void Cart() {
	   Click(add_item);
	   Click(shopping_icon);
	   Click(next_button);
   }
}
