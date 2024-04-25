package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testPages.ExcelData;

public class XYZ {

	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 ExcelData data =new ExcelData();
		 driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();
	
		 driver.findElement(By.xpath("//button[normalize-space(text())='Add Customer']")).click();
		
		 WebElement fn=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		 fn.sendKeys(data.get_FirstName());
		 File sc=fn.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(sc,new File("webelementpic.png"));
		 
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data.get_LastName());
		
		
		 driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys(data.get_PostalCode());
		 
		 driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		 
		// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //FileUtils.copyFile(src,new File("./Screenshot/sc2.png"));
		 
		 String alerttext = driver.switchTo().alert().getText();
		 String a=alerttext.split(":")[1];
		 Integer i=Integer.valueOf(a);
		 data.writedata(i);
		 System.out.println(a);
		 driver.switchTo().alert().accept();
		 

	}

}
