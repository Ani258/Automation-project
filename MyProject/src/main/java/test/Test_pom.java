package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Sign_in;
import pom.Start;

public class Test_pom {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.browserstack.com/");
			
			Start s=new Start(driver);
			s.clicklogin();
			
			Sign_in si=new Sign_in(driver);
			si.signin();
			si.gmail();
			si.password();
			Thread.sleep(2000);
			si.cookies();
			si.signme();
		//	Thread.sleep(3000);
	}

}
