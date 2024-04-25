package pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Startpf {

	WebDriver driver;
	@FindBy(id="signupModalProductButton") WebElement btn;
	
	
	
	public Startpf(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void getstart() {
		btn.click();

	}

}
