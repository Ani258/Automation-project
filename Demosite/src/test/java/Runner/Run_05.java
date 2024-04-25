package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features={"src\\test\\java\\Feature\\Login_05.feature"},
	        glue={"Stepdef"},plugin= {"pretty","html:target/Login05_report.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
	
	)
public class Run_05 {

}
