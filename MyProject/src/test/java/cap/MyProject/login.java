package cap.MyProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class login {
	XSSFCell cell;
	XSSFSheet sh;
	XSSFWorkbook wb;
	WebElement user;
	WebElement pwd;

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver","C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\MyProject\\Div\\msedgedriver.exe");
		    WebDriver driver = new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.saucedemo.com");
		    Thread.sleep(1000);
		   
		WebElement user=driver.findElement(By.id("user-name"));
		WebElement pwd= driver.findElement(By.id("password"));
	    driver.findElement(By.id("login-button"));
	}
	    
	    public void readExcel() throws IOException 
		{
			File src = new File("‪C:\\Users\\ar83\\Desktop\\Book1.xlsx");
			FileInputStream fis= new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			String uname= sh.getRow(0).getCell(0).getStringCellValue();
			String pass= sh.getRow(1).getCell(1).getStringCellValue();
	       
	        
		}
	 
	   

}
