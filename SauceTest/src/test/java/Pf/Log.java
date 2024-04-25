package Pf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Log {
	WebDriver driver;
	By use=By.cssSelector("#user-name");
	By pass=By.cssSelector("#password");
	By log=By.className("submit-button btn_action");

public Log(WebDriver driver) {
	this.driver=driver;
}
public void uname(String username) {
	driver.findElement(use).sendKeys(username);;
}
public void pword(String password) {
	driver.findElement(pass).sendKeys(password);;
}
public void enter() {
	driver.findElement(log);	
}
}