package test;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features={"C:\\Windows\\System32\\config\\systemprofile\\eclipseProject\\SauceTest\\src\\test\\resource\\user.feature"},
        glue={"Step"})

public class Run_Log {

}
