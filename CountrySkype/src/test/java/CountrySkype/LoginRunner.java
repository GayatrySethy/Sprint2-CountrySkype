package CountrySkype;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
	@CucumberOptions(features="./src/test/resources/SkypeFeatures/login.feature",glue= {"CountrySkype"},
	//tags = "@SmokeTest", 
	dryRun = true,
	monochrome = true,
	
	plugin={"pretty","html:target/JunitReports/index.html"}
		
	
	)
	public class LoginRunner {

	}