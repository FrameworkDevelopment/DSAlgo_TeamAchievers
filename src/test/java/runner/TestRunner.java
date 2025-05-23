package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features =     
               {"src/test/resources/features/UC01_homePage.feature",
              "src/test/resources/features/UC02_registerPage.feature",
  			  "src/test/resources/features/UC03_1_loginAndBasicNavigation.feature",    
  			  "src/test/resources/features/UC03_2_fullNavigationAndLogout.feature",
   			  "src/test/resources/features/UC04_dataStructureIntro.feature",
   			  "src/test/resources/features/UC05_arrayPage.feature",
          	  "src/test/resources/features/UC06_linkedListPage.feature"},
   
    glue = {"StepDefinitions", "AppHooks"}, 
    monochrome = true, 
    dryRun = false,
    // tags = "@TC01 or @TC02",
    plugin = {
        "pretty", 
        "html:target/cucumber-reports/cucumber.html",         
        "json:target/cucumber-reports/cucumber.json", 
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "com.aventstack.chaintest.plugins.ChainTestCucumberListener:"} 
    
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false) 
    public Object[][] scenarios() {
        return super.scenarios(); 
    }
}