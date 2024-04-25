package ebay.com.labdemo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apoolo2 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		driver.findElement(By.xpath("")).click();
}
}
