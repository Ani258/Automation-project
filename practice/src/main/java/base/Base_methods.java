package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_methods {
	 
	public static  WebDriver driver;
	public void launchBrowser()
	{
	driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	driver.manage().window().maximize();
    }
}