package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import util.generic;

public class Testpage extends generic {
	@FindBy(xpath = "//button[text()='Bank Manager Login']")
	WebElement bankmanagerlogin;
	@FindBy(xpath = "//button[@ng-class='btnClass1']")
	WebElement addcustomerBtn;
	@FindBy(xpath = "//button[@ng-click='addCust()']")
	WebElement addcustomerTile;
	@FindBy(xpath = "//input[@ng-model='fName']")
	WebElement fname;
	@FindBy(xpath = "//input[@ng-model='lName']")
	WebElement lastname;
	@FindBy(xpath = "//input[@ng-model='postCd']")
	WebElement postcode;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitdetails;
	@FindBy(xpath = "//button[@ng-click='openAccount()']")
	WebElement openaccBtn;
	@FindBy(id="userSelect")
	WebElement cusName;
	@FindBy(id="currency")
	WebElement currency;
	@FindBy(xpath="//button[text()='Process']")
	WebElement process;
	@FindBy(xpath = "//button[@ng-click='showCust()']")
	WebElement custTile;
	@FindBy(xpath = "//input[@ng-model='searchCustomer']")
	WebElement searchCus;
    WebDriver driver;
	public Testpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void bank() {
		clickelement(bankmanagerlogin);
		clickelement(addcustomerBtn);
	}
	
	public void newcustomer(String firstname,String Lastname,String pin) {
		 input(fname,firstname);
		 input(lastname,Lastname);
		 input(postcode,pin);
	}
	public int submit() {
		clickelement(submitdetails);
		driver.switchTo().alert().getText();
		String alerttext = driver.switchTo().alert().getText();
		 String a=alerttext.split(":")[1];
		 Integer i=Integer.valueOf(a);
		 System.out.println(a);
		 driver.switchTo().alert().accept();
		 return i;
	}
	public void openaccount() {
		clickelement(openaccBtn);
		Select s=new Select(cusName);
		s.selectByVisibleText("anitha r");
		Select sc=new Select(currency);
		sc.selectByVisibleText("Rupee");
		clickelement(process);	
	}
	public void customer() {
		clickelement(custTile);
		
	}

}
