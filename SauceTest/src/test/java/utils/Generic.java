package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic {
  static WebDriver driver;
   public Generic(WebDriver driver) {
	   this.driver=driver;
   }
   public static void Click(WebElement element) {
	   element.click();
   }
   public static void VisibilityOfElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
