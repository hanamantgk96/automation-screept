package CucumberOption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNgRunner {
	
	@CucumberOptions(features = "src/test/java/FeatureFile", glue = "StepDefinition",tags="@tag21"
			)
			public class TestNGRunner extends AbstractTestNGCucumberTests {
				
	}
}
