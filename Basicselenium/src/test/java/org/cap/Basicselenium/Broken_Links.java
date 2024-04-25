package org.cap.Basicselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement>links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(int i=1;i<links.size();i++) {
			
			String url=links.get(i).getAttribute("href");
			String t=links.get(i).getText();
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            //System.out.println(respCode);
            if(respCode>=400) {
            	System.out.println(t+" "+respCode+"is error page");
            }
		}

	}

}
