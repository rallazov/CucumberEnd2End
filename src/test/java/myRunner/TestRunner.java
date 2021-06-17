package myRunner;

import gherkin.ast.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./Features" ,
        glue = {"stepDefinitions"},
        dryRun = false,
        tags = "@run, @Regression",
        plugin = {"pretty","html:test-output" , "json:target/cucumber.json"}


)
public class TestRunner {

}
