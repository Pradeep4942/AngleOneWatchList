package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		features =".//FeatureFile/Watchlist.feature",
		glue = "StepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/reports1.html"}
		
		)

public class Run
{/* 
     No Write inside the Class
     all code write out of the class
     
*/
}
