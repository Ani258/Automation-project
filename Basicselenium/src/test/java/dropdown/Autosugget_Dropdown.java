package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosugget_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		WebElement suggest=driver.findElement(By.xpath("//ul[@id='ui-id-1']"));   //common list
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(suggest)); 
	  //  Thread.sleep(2000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item']")); //suggested list
		for(WebElement drop :options)
		{
		if(drop.getText().equalsIgnoreCase("India"))
		{
			System.out.println(drop.getText());
		drop.click();
		break;
		}
		
		}
	}
}
