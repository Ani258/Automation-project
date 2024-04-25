package Step_definition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen {

	public static void CaptureScreenshot(WebDriver d, String filename) throws IOException {


	        TakesScreenshot ts=(TakesScreenshot)d;
	        File file=ts.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(file , new File("./Screenshots/"+filename+".png"));

	 

	    }    

	}


