package cap.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		

		//System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/droppable");
			driver.manage().window().maximize();
			driver.getPageSource();
//			Actions act=new Actions(driver);
//			WebElement f=driver.findElement(By.id(("draggable")));
//			WebElement t=driver.findElement(By.id(("droppable")));
//			
//			act.dragAndDrop(f,t).build().perform();
//			Thread.sleep(9000);
			System.out.println("success");
			
		
	}

}
