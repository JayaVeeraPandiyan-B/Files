package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"Features/oHRMlogin.feature"},
dryRun = !true,
glue = "stepDefinitions",
monochrome = true)

public class OHRMRunner {
	
	

}
