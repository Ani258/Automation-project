package ebay.com.labdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//WebElement uname=driver.findElement(By.id("user-name"));
		//uname.sendKeys("standard_user");
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//WebElement pwd=driver.findElement(By.name("password"));
		//pwd.sendKeys("secret_sauce");
		
	    //WebElement button=driver.findElement(By.id("login-button"));
		//button.click();
		
       //driver.findElement(By.linkText("Images")).click();
       
       //driver.findElement(By.partialLinkText("Ima")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		//String current=driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		
		//String title=driver.getTitle();
		//System.out.println("the title is:"+title);
		
		//System.out.println(driver.getTitle());
		
		/*WebElement a=driver.findElement(By.id("user-name"));
		System.out.println(a.getAttribute("class"));
		System.out.println(a.getTagName());  */
		
		/*try {
		WebElement b=driver.findElement(By.id("login-button"));	
		String logcolor=b.getCssValue("color");
		System.out.println(logcolor);
			
		}
		finally {
			   
			driver.close();
		}  */
		
		WebElement b=driver.findElement(By.id("login-button"));
		if(b.isDisplayed())
		{
			b.click();
			System.out.println("Successful login");
		}
		System.out.println(b.isDisplayed());
		System.out.println(b.isEnabled());
		
		
	    

		Thread.sleep(2000);
		driver.close();
		
		
		
	}
   
}
