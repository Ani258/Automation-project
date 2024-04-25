package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features={"C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\saucelab\\src\\test\\java\\feature\\Login.feature"},
        glue={"stepdefinition"}
     //   plugin= {"pretty","html:target/cucumber-reports/report.html"},
       // monochrome=true

)

public class Run_01 {

}
