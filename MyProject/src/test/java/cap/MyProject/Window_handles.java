package cap.MyProject;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles {

	public static void main(String[] args) throws InterruptedException, IOException {
	
	//	System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/browser-windows");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("windowButton")).click();
			String parent=driver.getWindowHandle();
			//System.out.println("parent id:"+parent);
			Set<String> s=driver.getWindowHandles();
			Iterator<String> it=s.iterator();
			while(it.hasNext()) {
				String childid=it.next();
				if(!parent.equalsIgnoreCase(childid)) {

					driver.switchTo().window(childid);
				//	System.out.println("child id:"+childid);
					System.out.println( driver.findElement(By.id("sampleHeading")).getText());
					Thread.sleep(3000);
					
				}
			}
			Thread.sleep(2000);
			
			TakesScreenshot sc=(TakesScreenshot)driver;
			File Src=sc.getScreenshotAs(OutputType.FILE);
			File dst=new File("./screenshot/scr1.png");
			FileUtils.copyFile(Src,dst);
					
	}

}
