package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
	features =   "src/test/resources/features/UC01_homePage.feature", 
		  
        glue = {"StepDefinitions", "AppHooks"}, // Package containing step definitions
               monochrome = true, 
               dryRun=false,
               tags = "@TC01 or @TC02",
        plugin = {
                "pretty", 
                "html:target/cucumber-reports/cucumber.html", 
                "json:target/cucumber-reports/cucumber.json", 
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                //"com.aventstack.chaintest.plugins.ChainTestCucumberListener:"} //chain test report
        
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = true) 
    public Object[][] scenarios() {
        return super.scenarios(); 
    }
      

	}
    