package com.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class swagtestng {
	
	
	
	   @Test
       public void SwagAssert()
       {
		   System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			String expectedTitle="google";
			String actualtitle = driver.getTitle();
			
			assertEquals(actualtitle,expectedTitle,"title mismatched");
			
       }
      
	   
	   /*
	   public void GoogleSearch()
	   {
    	   System.out.println("search the title");
       }
	   
	   @Test
	   public void SearchData()
	   {
		   System.out.println("search the data");
	   }
       
	   public void PageData()
	   {
		   System.out.println("search the page");
	   } */
}
