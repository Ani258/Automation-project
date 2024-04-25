package testpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepdefinition.BankManger;

public class CreateCustomer extends BankManger {
       @FindBy(xpath="//button[@ng-click='manager()']")WebElement Bankmanager;
       @FindBy(xpath="//button[@ng-class='btnClass1']")WebElement Addcustomer;
       @FindBy(xpath="//input[@placeholder='First Name']")WebElement Firstname;
       @FindBy(xpath="//input[@placeholder='Last Name']")WebElement Lastname;
       @FindBy(xpath="//input[@placeholder='Post Code']")WebElement Postcode;
       @FindBy(className="btn btn-default")WebElement Submitdetails;
       @FindBy(xpath="//button[contains(@class,'btn-lg tab btn')]")WebElement Openaccount;
       @FindBy(xpath="//select[contains(@class,'ng-pristine ng-invalid')]")WebElement Customername;
       @FindBy(xpath="//option[@ng-repeat='cust in Customers']")List <WebElement> Selectcustomer;
       @FindBy(name="currency")WebElement Currency;
       @FindBy(xpath="//button[@type='submit']")WebElement Process;
       @FindBy(className="btn btn-lg tab btn-primary")WebElement Customers;
       @FindBy(xpath="//input[@placeholder='Search Customer']")WebElement SearchCustomer;
       @FindBy(xpath="//button[text()='Delete']")WebElement Deleteuser;
       WebDriver driver;
       public CreateCustomer(WebDriver driver) {
    	   this.driver=driver;
    	   PageFactory.initElements(driver,this);
       }
       public void LoginBankMangaer() {
    	   Bankmanager.click();
       }
       public void NewCustomer() {
    	   Addcustomer.click();
    	   Firstname.sendKeys("abi");
    	   Lastname.sendKeys("man");
    	   Postcode.sendKeys("67854");
    	   Submitdetails.click();
    	   String alerttext=driver.switchTo().alert().getText();
    	   driver.switchTo().alert().accept();
    	   System.out.println(alerttext); 	   
       }
       public void CheckAccount() {
    	   Openaccount.click();
    	   Customername.click();
    	   Select s=new Select(Customername);
    	   s.selectByVisibleText("abi man");
    	   Currency.click();
    	   Select sc=new Select(Currency);
    	   sc.selectByValue("Rupee");
    	   Process.click();
    	   String alerttext2=driver.switchTo().alert().getText();
    	   driver.switchTo().alert().accept();
    	   System.out.println(alerttext2);
    	   
       }
       public void SearchCustomer() {
    	   Customers.click();
    	   SearchCustomer.sendKeys("abi man");
       }
       public void Deletecustomer() {
    	   Deleteuser.click();
       }
}
