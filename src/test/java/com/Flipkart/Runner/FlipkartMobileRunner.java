package com.Flipkart.Runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/Features" , glue = {"com.Flipkart.StepDefinition"}, plugin = {"pretty", "html:target/cucumber-reports/Cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json"}
)
public class FlipkartMobileRunner {

	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUp() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		
	}
	
	@Test(dataProvider = "features")
	public void features(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
		}
	
		@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}

	
}
