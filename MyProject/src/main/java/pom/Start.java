package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Start {

	WebDriver driver;
	By getstart=By.id("signupModalProductButton");

	public Start(WebDriver driver) {
		this.driver=driver;
	}
	public void clicklogin() {
		driver.findElement(getstart).click();
	
	}

}
