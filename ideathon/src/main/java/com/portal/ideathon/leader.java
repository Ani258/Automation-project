package com.portal.ideathon;

import org.openqa.selenium.By;

public class leader {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\ideathon\\Driver\\chromedriver.exe");
			
		    WebDriver driver=new chromeDriver();
			driver.manage().window().maximize();
			driver.get("http://apacworld.in.capgemini.com:9090/APACWorld/#/");
			driver.findElement(By.xpath("//input[@placeholder='User Id']")).sendKeys("kdevika");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Welcome@22");
			//driver.findElement(By.css="button[contains(text(),'Sign In')]").click();
		

	}

}
