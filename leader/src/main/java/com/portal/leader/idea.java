package com.portal.leader;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class idea {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\leader\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.24.161.103:9080/APACWorld/#/");
	
		
		//	Actions action = new Actions(driver);
		
		//LOGIN PAGE
		driver.findElement(By.xpath("//input[@placeholder='User Id']")).sendKeys("kdevika");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Welcome@22");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
	
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,-350)", "");
		//IDEATHON
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/mat-card/div/div[2]/ng-scrollbar/div/div/div/div/div/div[4]/div/div/a/img")).click();
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/mat-card/div/div[2]/ng-scrollbar/div/div/div/div/div/div[4]/div/mat-card-title")).click();
        //driver.findElement(By.cssSelector("body > app-root > app-home > div.welcome > mat-card > div > div.col-md-9 > ng-scrollbar > div > div > div > div > div > div:nth-child(4) > div > mat-card-title")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/app-root/p/app-landing-page/app-nav-landing/nav[2]/div/button[1]/span[1]/img/html/body/app-root/p/app-landing-page/app-nav-landing/nav[2]/div/button[1]/span[1]")).click();
		//driver.findElement(By.linkText("View Dashboard")).click();
		//driver.findElement(By.xpath("/html/body/app-root/p/app-landing-page/app-nav-landing/nav[2]/div/button[1]/span[1]/span")).click();
		//Dash
		driver.findElement(By.xpath("//*[text()='View Dashboard']")).click();
		Thread.sleep(3000);
	//	WebElement link = driver.findElement(By.name("viewport")),element;
		//System.out.println(link.getAttribute("content"));
//		action.keyDown(Keys.TAB).perform();
//		action.keyDown(Keys.TAB).perform();
//		action.keyDown(Keys.ENTER).perform();
		//element=driver.findElement(By.linkText("View Dashboard"));
		//action.moveToElement(element).click().perform();

		//action.moveToElement(element).click();
		
		
		
		
	}

}
