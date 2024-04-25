package ebay.com.labdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class apollo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.manage().window().maximize();
		
		
		//@FindBy(xpath="//button[@id='wzrk-cancel']")
		
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		driver.findElement(By.id("loginPopup")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("8610460862");
		//Thread.sleep(1000);
		
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@class='MuiFab-label']")).click();
		Thread.sleep(15000);
		

		
		
		driver.findElement(By.xpath("//span[@class='icon-ic_arrow_forward']")).click();
		Thread.sleep(5000);
		
		//  //body/div[8]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]/span[1]/span[1]
		
		Robot robot=new Robot();
	
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("pooja");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.name("lastName")).sendKeys("Ani");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).sendKeys("01022003");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
	   driver.findElement(By.xpath("//button[@value='FEMALE']")).click();
	   robot.keyPress(KeyEvent.VK_TAB);
	   robot.keyRelease(KeyEvent.VK_TAB);
		
	   driver.findElement(By.name("emailAddress")).sendKeys("ani7@gmail.com");
	   robot.keyPress(KeyEvent.VK_TAB);
	   robot.keyRelease(KeyEvent.VK_TAB);
		
	   driver.findElement(By.xpath("//input[@placeholder='Enter Referral Code']")).sendKeys("2345");
		
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(2000); 
		
		
		
		
		
		
		
		driver.close();
	}

}

//driver.findElement(By.xpath("//input[@type='checkbox'][value checked]")).click();
 // /html/body/div[4]/div[3]/div/div/div/form/div[2]/button


//Thread.sleep(2000);
		//Robot robot=new Robot();
		//driver.findElement(By.name("firstname")).sendKeys("Anitha");
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);



//span[@class='MuiFab-label']
		//driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div/form/div[2]/button/span[2]")).click();
	//	 Robot robot =new Robot();
		// robot.keyPress(KeyEvent.VK_ENTER);
    //   Thread.sleep(2000);
//		Actions act=new Actions(driver);
//		act.sendKeys(Keys.TAB).build().perform();
	
//		driver.findElement(By.xpath("//button[@aria-label='Sign in']"));
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).build().perform();
		
		/* driver.findElement(By.name("firstName")).sendKeys("Aji");
		
		driver.findElement(By.name("lastName")).sendKeys("Ani");
		
		driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).sendKeys("01/02/2003");
		
		driver.findElement(By.xpath("//button[@value='FEMALE']")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("ani7@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Referral Code']")).sendKeys("2345");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		*/
//  /html/body/div[6]/div[3]/div/form/div[3]/button