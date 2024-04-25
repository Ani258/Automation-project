package cap.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssXpath {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://nxtgenaiacademy.com/demo-site/");
	    
	    driver.findElement(By.cssSelector("input#vfb-5")).sendKeys("ani");
	    
	    driver.findElement(By.cssSelector("input[name=vfb-7]")).sendKeys("radha");
	    
		driver.findElement(By.cssSelector("input[value='Female']:nth-child(1)")).click();
		    
		driver.findElement(By.cssSelector("input[name*='vfb-13[address]']")).sendKeys("Gandhi street");
		    
		driver.findElement(By.xpath("//input[contains(@name,'vfb-13[address-2]')]")).sendKeys("13b block");
		    
		driver.findElement(By.xpath("//input[@name='vfb-13[city]']")).sendKeys("Tenkasi");
		    
		driver.findElement(By.xpath("//input[@name='vfb-13[state]']")).sendKeys("Tamilnadu");
		    
        driver.findElement(By.xpath("//input[starts-with(@id,'vfb-13-zip')]")).sendKeys("627859");
		    
	    driver.findElement(By.xpath("//span[contains(@class, 'select2-selection__arrow')]")).click();
		  
		driver.findElement(By.xpath("//li[text()='India']")).click();
	    Thread.sleep(1000);

	    driver.findElement(By.xpath("//input[@name='vfb-14 'or @class='vfb-text  vfb-medium  required  email ']")).sendKeys("anitha@gmail.com");
		   
        driver.findElement(By.cssSelector("input#vfb-19")).sendKeys("9876543210");

        driver.findElement(By.xpath("//textarea[@name='vfb-23'and@id='vfb-23']")).sendKeys("Nice");
		    
		driver.findElement(By.xpath("//label[text()='Selenium WebDriver']")).click();
		    
		driver.findElement(By.cssSelector("input[style='display:block']")).sendKeys("99");
		    
		driver.findElement(By.cssSelector("input.vfb-submit")).click();
			

	}

}
