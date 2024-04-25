package ebay.com.labdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfacebook%20login%20account%7C&placement=&creative=589460569900&keyword=facebook%20login%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-296914611740%26loc_physical_ms%3D9302586%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAhqCdBhB0EiwAH8M_GqrpdzCaDbwCmOkF4ljv_7tjMgT6YSpK5-lrGVGEBMvh-e0DES7d4xoC-jsQAvD_BwE");
		driver.manage().window().maximize();

		String current=driver.getCurrentUrl();
	    System.out.println("Current URL:"+current);
		
		String title=driver.getTitle();
		System.out.println("the title is:"+title);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		
		String parenthandle=driver.getWindowHandle();
		System.out.println("window id:"+parenthandle);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().window(parenthandle);
		
		driver.findElement(By.name("firstname")).sendKeys("Anitha");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastname")).sendKeys("Radha");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("anitha7@gmail.com");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("anitha7@gmail.com");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ani@123");
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		WebElement r=driver.findElement(By.id("day"));
		Select s=new Select(r);
		s.selectByIndex(1);
		Thread.sleep(3000);
		
		WebElement t=driver.findElement(By.id("month"));
		Select s1=new Select(t);
		s1.selectByVisibleText("Aug");
		Thread.sleep(3000);
		
		WebElement u=driver.findElement(By.id("year"));
		Select s2=new Select(u);
		s2.selectByValue("2000");
		Thread.sleep(3000);
		
		/*ist<WebElement>radio=driver.findElements(By.xpath("//label[@for='u_0_4_Zk']"));
		
		for(WebElement e:radio){
 
			if(e.getAttribute("value"){
			  e.click();
			  Thread.sleep(3000);
		}
		}	*/	
		
	    /*  driver.findElement(By.xpath("//input[@value='1']")).click();
	
		driver.findElements(By.xpath("//input[@value='2']"));
		driver.findElements(By.xpath("//input[@value='-1']")); */

		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(3000);
		
		driver.close();
		

		
		
		
				
		
		

	}

}
