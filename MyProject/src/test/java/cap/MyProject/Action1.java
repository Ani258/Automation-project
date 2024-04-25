package cap.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/droppable");
			driver.manage().window().maximize();
			
			Actions act=new Actions(driver);
			WebElement f=driver.findElement(By.xpath("//a[text()='Sign in'][1]"));
			

	}

}
