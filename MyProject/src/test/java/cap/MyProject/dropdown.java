package cap.MyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.id("divpaxinfo")).click();
	    for(int i=1;i<6;i++) {
	    	driver.findElement(By.id("hrefIncAdt")).click();
	   
	    } 
	    
	    Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    s.selectByVisibleText("AED");
	  //  Thread.sleep(2000);
	    
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[text()=' Chennai (MAA)']")).click();
	    driver.findElement(By.xpath("(//a[text()=' Kochi (COK)'])[2]")).click();
	    
	       

	}

}
