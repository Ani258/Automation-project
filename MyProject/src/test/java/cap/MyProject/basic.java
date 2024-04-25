package cap.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://nxtgenaiacademy.com/demo-site/");
	    driver.findElement(By.name("vfb-5")).sendKeys("anitha");
	    
	    driver.findElement(By.id("vfb-7")).sendKeys("R");
	 
	    driver.findElement(By.id("vfb-31-2")).click();
	    driver.findElement(By.name("vfb-13[address]")).sendKeys("abch");
	   
	    driver.findElement(By.name("vfb-13[address-2]")).sendKeys("abc");
	    
	    driver.findElement(By.id("vfb-13-city")).sendKeys("abc");
	    
	    driver.findElement(By.id("vfb-13-zip")).sendKeys("abc");
	    
	    driver.findElement(By.id("select2-vfb-13-country-result-q9cl-Argentina")).click();
	
	    driver.findElement(By.id("vfb-14")).sendKeys("abc@gmail.com");
	
	    driver.findElement(By.id("vfb-19")).sendKeys("9876543210");
	  
	    driver.findElement(By.id("vfb-23")).sendKeys("abc");
	  
	    driver.findElement(By.id("vfb-3")).sendKeys("99");
	    
	    driver.findElement(By.name("vfb-submit")).click();
	    
	
	}
}
