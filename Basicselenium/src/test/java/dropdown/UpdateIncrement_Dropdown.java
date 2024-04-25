package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateIncrement_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	    for(int i=1;i<4;i++) {
	    	driver.findElement(By.id("hrefIncAdt")).click();
	    	driver.findElement(By.id("hrefIncChd")).click();
	    	}
	    driver.findElement(By.id("btnclosepaxoption")).click();
         System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}