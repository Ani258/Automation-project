package basePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
	
	public static WebDriver driver;
	
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void closeBrowser()
	{
		driver.quit();
	}

}
