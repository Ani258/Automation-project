package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sign_in {

	WebDriver driver;
	By sign=By.xpath("//a[text()='Sign in'][1]");
    By gmail=By.id("user_email_login");
    By password=By.id("user_password");
    By allcookies=By.id("accept-cookie-notification");
    By signme=By.cssSelector("input#user_submit");
    
	  public Sign_in(WebDriver driver) {
		this.driver=driver;
	}
	public void signin() {
		driver.findElement(sign).click();
	}
	public void gmail() {
		driver.findElement(gmail).sendKeys("anitharadha20@gmail.com");
	}
    public void password() {
    	driver.findElement(password).sendKeys("Anitha");
    }
    public void cookies() {
    	driver.findElement(allcookies).click();
    }
    public void signme() {
    	driver.findElement(signme).click();
    }
}
