package Test;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Google {

	@Test
	public void home() {
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL(
	}
}
