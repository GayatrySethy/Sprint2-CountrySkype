package SkypeChats;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
	@CucumberOptions(features="./src/test/resources/SkypeFeatures/login.feature",glue= {"SkypeChats"},
	//tags = "@SmokeTest", 
	dryRun = true,
	monochrome = true,
	
	plugin={"pretty","junit:target/JunitReports/report2.xml"}
		
	
	)

public class ChatRunner {

}
