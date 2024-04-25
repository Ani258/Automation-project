package newchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chrometest {

	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\javawork\\SampleChrome\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement()
	}
}
