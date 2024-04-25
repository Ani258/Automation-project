package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature/Apollologin.feature",glue="Step_definition",plugin= {"pretty","html:target/Reports.html"})

public class Runnerfile {

}
