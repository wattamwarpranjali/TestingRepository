package Runnerjava;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = {"/Users/amarwattamwar/eclipse-workspace/CoverFoxnew/src/test/resources/Coverfoxfeature/coverFoxHealthInsurance.feature"
				//"/Users/amarwattamwar/eclipse-workspace/CoverFoxnew/src/test/resources/Coverfoxfeature/Multiscenario.feature"
				//"/Users/amarwattamwar/eclipse-workspace/CoverFoxnew/src/test/resources/Coverfoxfeature/GmailLoginDataTable.feature"
				//"/Users/amarwattamwar/eclipse-workspace/CoverFoxnew/src/test/resources/Coverfoxfeature/coverFoxMultipleData.feature"
				//"/Users/amarwattamwar/eclipse-workspace/CoverFoxnew/src/test/resources/Coverfoxfeature/Multiscenario.feature"
				//"/Users/amarwattamwar/eclipse-workspace/CoverFoxnew/src/test/resources/Coverfoxfeature/coverFoxHealthInsurance.feature"
				},
		  glue = {"stepDefinitions","hooks"},
		  plugin = {
				  "pretty",
				  "html:target/cucumber-reports/reports.html",
			        "json:target/cucumber-reports/cucumber.json"
                   },
		 //tags="@retest",
		  dryRun=false
		  //publish = true 
				
		)

@Test 
public class healthInsuranceRunner extends AbstractTestNGCucumberTests{
	
	
	

}
