package org.cap.Basicselenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/");
 
		// Store all link elements (anchor tag elements in html) in a list
		List<WebElement> links = driver.findElements(By.cssSelector("div[class='col-6 col-md-2 mb-4'] a"));
		System.out.println(links.size());
 
		// Print no. of links stored in list
		for (int i = 1; i <= links.size(); i ++) {
			// Print text of all the links
			//System.out.println(((WebElement) links.get(i)).getText());
 
			// Get href attribute
			WebElement elem = links.get(i);
			String linkUrl = elem.getAttribute("href");
			// Call Verify Links method
			verifyLinks(linkUrl);
 
		}
 
		// Close WebDriver
		driver.quit();
	}
 
	public static void verifyLinks(String websiteLink) throws IOException {
		// Create URL object and pass website link
		URL url = new URL(websiteLink);
 
		// Create URL connection and Get the response code
		HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
		httpURLConnect.setConnectTimeout(5000);
		httpURLConnect.connect();
 
		// Verify Response code
		if (httpURLConnect.getResponseCode() >= 400) {
			System.out.println(websiteLink + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
		}
		// Fetching and Printing the response code obtained
		else {
			System.out.println(websiteLink + " - " + httpURLConnect.getResponseMessage());
		}
 
		// Disconnect URL Connection
		httpURLConnect.disconnect();

	}

}
