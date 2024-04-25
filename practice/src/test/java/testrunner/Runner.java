package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\XYZ\\src\\test\\java\\feature\\Customer.feature"},
        glue={"stepdefinition"})
  // ,plugin= {"pretty","html:target/Saucedemo_report.html"})
public class Runner {

}
