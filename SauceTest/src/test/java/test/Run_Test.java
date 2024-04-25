package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.Add_Products;
import pages.Login_01;
import pages.Logout_01;

public class Run_Test {
	public static WebDriver driver;

	@BeforeSuite
	public void url() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}

	@BeforeMethod()
	public void loginpage() {
		Login_01 log = new Login_01(driver);
		log.Login();
	}

	@AfterMethod()
	public void logout() {
		Logout_01 lout = new Logout_01(driver);
		lout.Logout();
	}

	@Test()
	public void AddCart() {
		Add_Products add = new Add_Products(driver);
		add.Cart();
	}

	@AfterSuite
	public void close() {
		driver.quit();
	}
}
