package org.cap.Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robots_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              WebDriver driver=new ChromeDriver();
              driver.navigate().to("https://demoqa.com");
              driver.manage().window().maximize();
              
              WebElement a= driver.findElement(By.xpath("//h5[text()='Forms']"));
              JavascriptExecutor js=(JavascriptExecutor)driver;
              js.executeScript("arguments[0].scrollIntoView();",a);
              js.executeScript("arguments[0].click();",a);
              driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
              WebElement b=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
             // js.executeScript("arguments[0].scrollIntoView();",b);
              //ac.moveToElement(b).click().perform(); 
              js.executeScript("arguments[0].value='anitha';",b);
              js.executeScript("arguments[0].value=arguments[1];",b,"anitha");
              js.executeScript("document.getElementById('lastName').value='Radha';");
              WebElement em =driver.findElement(By.id("userEmail"));
              js.executeScript("arguments[0].scrollIntoView();",em);
              Actions ac=new Actions(driver);
             ac.moveToElement(em).click().sendKeys("abc@gmail.com").build().perform();	
         //  driver.quit();
            
	}

}
