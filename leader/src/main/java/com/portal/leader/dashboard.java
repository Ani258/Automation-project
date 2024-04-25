package com.portal.leader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dashboard {

	public static void main(String[] args) throws InterruptedException {
	
       System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\leader\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.24.161.103:9080/ideaapac/#/approver_view");
		//Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div[1]/div[3]/button/span")).click();
		//Thread.sleep(3000);
		
	}

}
