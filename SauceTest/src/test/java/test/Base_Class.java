package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base_Class {
	WebDriver driver;
	@BeforeSuite
	public void url() {
	driver = new EdgeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
    }
	@AfterSuite
    public void close() {
    	driver.quit();
    }
}
