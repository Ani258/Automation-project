package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basePackage.BrowserSetup;
import testPages.LoginPage;

public class LoginTest extends BrowserSetup{

	@BeforeSuite()
	public void initializeBrowser()
	
	{
		launchBrowser();
	}
/*	@AfterSuite()
	public void quitBrowser()
	{
		closeBrowser();
	}  */
	
	@Test()
	public void loginPage() throws IOException
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName();
		loginPage.NewCustomer();
	//	loginPage.CheckAccount();
	//	loginPage.SearchCustomer();
	//	loginPage.Deletecustomer();
		
	/*	loginPage.enterUserName("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLoginBtn();  */
	}

}
