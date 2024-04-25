package org.cap.Basicselenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        List<WebElement> rows =driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
        int r=rows.size();
        System.out.println(r);
        List<WebElement> cols =driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/th"));
        int cl = cols.size();
        System.out.println(cl);
        for(int i=2;i<=r;i++) {
        	for(int j=1;j<=cl;j++) {
          String val=driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr [" +i+ "]/td ["+ j +"]")).getText();
          System.out.println("rows" +i+ "cols" +j+ "value" +val);
        }
	}
	}
}

