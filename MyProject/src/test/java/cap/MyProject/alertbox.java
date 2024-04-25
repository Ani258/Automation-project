package cap.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	    
	    driver.findElement(By.name("alertbox")).click();
	    driver.switchTo().alert();
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.name("confirmalertbox")).click();
	    driver.switchTo().alert();
	    driver.switchTo().alert().dismiss();
	    System.out.println(driver.findElement(By.cssSelector("p#demo")).getText());
	    
	    driver.findElement(By.name("promptalertbox1234")).click();
	    driver.switchTo().alert().sendKeys("yes");
	    
	    driver.switchTo().alert().accept();
	}

}
