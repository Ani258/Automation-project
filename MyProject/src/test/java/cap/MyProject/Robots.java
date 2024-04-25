package cap.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
 
public class Robots {
	 public static void main(String[] args) throws AWTException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
	  Thread.sleep(2000);
	  //Create object for Robot class
	  Robot robot=new Robot();
	  //Store the path of the file to be uploaded using StringSelection Class Object
	  StringSelection filepath=new StringSelection("C:\\Users\\ar83\\image1.png");
	  //Copy above path to Clipboard
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
	  //Press Control&V to paste the above path
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  Thread.sleep(1000);
	  //Release Control & V buttons
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  //Press Enter
	  robot.keyPress(KeyEvent.VK_ENTER);
	  //Release Enter
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  //wait for the file to get uploaded
	  //robot.delay(2000);
	  Thread.sleep(10000);
	  System.out.println("File Uploaded Successfully");
	  driver.quit();
	 }
	 }


