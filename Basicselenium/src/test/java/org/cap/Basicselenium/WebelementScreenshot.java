package org.cap.Basicselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebelementScreenshot {
	
	public static void main(String args[]) throws IOException {
		
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();

	 driver.findElement(By.xpath("//button[normalize-space(text())='Add Customer']")).click();
	
	 WebElement fn=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	 fn.sendKeys("Anitha");
	 File sc=fn.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(sc,new File("webelementpic.png"));
	}
}
