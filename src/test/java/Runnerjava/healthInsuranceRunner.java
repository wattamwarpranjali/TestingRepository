package Runnerjava;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = {"C:\\Users\\Bright\\Desktop\\push git project\\TestingRepository\\src\\test\\resources\\Coverfoxfeature\\coverFoxHealthInsurance.feature"
				
				},
		  glue = {"stepDefinitions","hooks"},
		  plugin = {"pretty","html:target/cucumber-reports/reports.html"},
		 //tags="@retest",
		  dryRun=false
		  //publish = true 
				
		)

@Test 
public class healthInsuranceRunner extends AbstractTestNGCucumberTests{
	
	
	

}
