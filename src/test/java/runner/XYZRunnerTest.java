package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		       features = "src/test/resources/orangehrm/",
		       glue = {"steps"},
		       plugin = {"pretty", "html:target/cucmber-report.html"},
		       monochrome = true 
		
		) 

public class XYZRunnerTest {

	
}
