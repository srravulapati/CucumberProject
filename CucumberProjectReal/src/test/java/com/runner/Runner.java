package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles", glue={"com.stepDefinition"}, 
monochrome=true,plugin= {"html:Reports\\HTMLReports","json:Reports\\JsonReports\\Cucumber.json", "junit:reports\\JUnitReport\\Cucumber.xml"},
dryRun=false, tags= "@SmokeTest and @SanityTest "
)
public class Runner {

}
