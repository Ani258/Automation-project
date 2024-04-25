package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom_01 {
	WebDriver driver2;
	By user=By.id("user-name");
	By pass=By.id("password");
	By login=By.id("login-button");
    By addcart=By.name("add-to-cart-test.allthethings()-t-shirt-(red)");
    By cart=By.className("shopping_cart_link");
    
    public void pom_01(WebDriver driver2) {
    	this.driver2=driver2;
    }
    public void username() {
    	driver2.findElement(user).sendKeys("standard_user");
    }
    public void password() {
    	driver2.findElement(pass).sendKeys("secret_sauce");
    }
    public void submit() {
    	driver2.findElement(login).click();
    }
    public void addproduct() {
    	driver2.findElement(addcart).click();
    }
    public void carticon() {
    	driver2.findElement(cart).click();
    }
    
}
