package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pf.Sign_inpf;
import pf.Startpf;

public class Test_pf {

	public static void main(String[] args) throws InterruptedException {
         

		System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.browserstack.com/");
			
			Startpf s=new Startpf(driver);
			s.getstart();
			
			Sign_inpf si=new Sign_inpf(driver);
			si.sign();
			si.mailid();
			si.password();
			Thread.sleep(2000);
			si.acceptcookies();
			si.submitbtn();

	}

}