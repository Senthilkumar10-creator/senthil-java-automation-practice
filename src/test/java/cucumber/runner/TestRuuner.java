package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = {"src/test/java/cucumber/features/LoginFeature.feature"}	,
	glue = {"cucumber.stepDefinition","cucumber.hooks"},
	monochrome = true,
	dryRun = false,
	tags = "@Sanity"
	
		)
public class TestRuuner extends AbstractTestNGCucumberTests{

}
