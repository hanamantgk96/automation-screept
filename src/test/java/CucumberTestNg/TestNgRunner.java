package CucumberTestNg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNgRunner {
	
@CucumberOptions(features = "src/test/java/featurefile", glue = "StepDefinition", monochrome = true, tags="@Login_01",
			
 			plugin = { "html:target/cucmber.html", "json:target/cucumber.json"})

			public class TestNgtestRunner extends AbstractTestNGCucumberTests{

}	

}
 