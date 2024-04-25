package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class generic {
	WebDriver driver;
	public generic(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void input(WebElement element,String text) {
		element.sendKeys(text);
	}
	public void clickelement(WebElement element) {
		element.click();
	}

}
