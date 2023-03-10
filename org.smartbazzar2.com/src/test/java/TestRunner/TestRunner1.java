package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Feature",glue = {"Stepdefinition"},
plugin={"pretty","html:target/cucumber-reports/my-report.html"},monochrome = true)

public class TestRunner1 extends AbstractTestNGCucumberTests {
}
