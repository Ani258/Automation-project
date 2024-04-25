package Genericfunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GenericLogin {
	WebDriver driver;
	public 	GenericLogin(WebDriver driver) {
		this.driver=driver;
	}
	public  String read_properties() throws IOException{
		// TODO Auto-generated method stub
		Properties prop = new Properties();
        FileInputStream fp = new FileInputStream("demo.properties");
        prop.load(fp);
        String chromepath = prop.getProperty("url");
        return chromepath;
	}
	//Method to sendKeys with the given XPath
	public void sendInput(WebElement InputField, String Input) {
    	InputField.sendKeys(Input);
    }
	
	//Method to use ImplicitWait
	public void ImplicitWait() {
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
    //Method to click on an element with the given XPath
    public void clickWebElement(WebElement element) {
        element.click();
    }
 
    //Method to select DropDown for filter the product
  	public void selectByVisibleText(WebElement element, String visibleText) { 
          Select select = new Select(element); 
          select.selectByVisibleText(visibleText); 
     } 
    
    //Method to compare the expected text and actual text
    public void Validateproduct(WebElement element, String ExpectedText) {
    	Assert.assertEquals(element.getText(),ExpectedText);
	}
    
    //Method to validate the element is displayed
	public void Validateproduct(WebElement element) {
		Assert.assertEquals(true, element.isDisplayed());
	}
}
