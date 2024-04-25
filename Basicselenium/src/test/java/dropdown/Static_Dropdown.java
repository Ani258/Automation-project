package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    WebElement drop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	//    drop.click();
	//    driver.findElement(By.xpath("//option[@value='INR']")).click();
	    Select s=new Select(drop);
	    s.selectByIndex(3);
	    
	    s.selectByVisibleText("AED");
	    
	    s.selectByValue("INR");
	    System.out.println(s.getFirstSelectedOption().getText());   
	    driver.quit();
	}

}
