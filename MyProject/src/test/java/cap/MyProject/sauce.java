package cap.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauce {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\sauce\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com");
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
    driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
    driver.findElement(By.className("shopping_cart_link")).click();
    

	}

}
