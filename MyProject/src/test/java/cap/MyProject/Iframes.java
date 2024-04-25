package cap.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			
			driver.switchTo().frame("frame1");
			System.out.println(driver.findElement(By.id("sampleHeading")).getText());
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			System.out.println(driver.findElement(By.cssSelector("div.main-header")).getText());
			driver.close();
			
			

	}

}
