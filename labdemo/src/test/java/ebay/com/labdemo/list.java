package ebay.com.labdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		/* driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		*/
		Thread.sleep(2000);
		
		List<WebElement>name=driver.findElements(By.tagName("input"));
		System.out.println("no.of elements:"+name.size());
		for(int i=0;i<name.size();i++)
		{
			System.out.println("input.text:"+name.get(i).getAttribute("value"));
		}
		
        driver.close();

	}

}
