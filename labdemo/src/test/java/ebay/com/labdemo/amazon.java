package ebay.com.labdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		String current=driver.getCurrentUrl();
	    System.out.println("Current URL:"+current);
	    
	    String title=driver.getTitle();
		System.out.println("the title is:"+title);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		
		WebElement s=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		s.sendKeys("phone");
		Thread.sleep(2000);
		
		WebElement c=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
