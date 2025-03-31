package AppHooks;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import DriverManager.Driver_SetUp;
import Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {

    @BeforeAll
    public static void loadConfig() throws IOException {
        ConfigReader.loadConfig(); // Load configuration only once
    }

    @Before
    public void setUp() throws Exception {
        String browser = ConfigReader.getBrowserType();
        if (browser == null || browser.isEmpty()) {
            throw new IllegalArgumentException("Browser type not specified in config.properties");
        }

        // Ensuring a new browser instance per thread
        Driver_SetUp.initializeBrowser(browser);
        
        String url = ConfigReader.getUrl();
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("URL not specified in config.properties");
        }

        Driver_SetUp.getDriver().get(url);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver_SetUp.getDriver()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment(scenario.getName() + " - Screenshot", new ByteArrayInputStream(screenshot));
        }
        
        // Closing driver after each test scenario to prevent memory leaks
        Driver_SetUp.closeDriver();
    }
}









































//package AppHooks;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import DriverManager.Driver_SetUp;
//import Utilities.ConfigReader;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeAll;
//import io.cucumber.java.Scenario;
//import io.qameta.allure.Allure;
//
//public class Hooks {
//
//    @BeforeAll
//    public static void loadConfig() throws IOException {
//        ConfigReader.loadConfig(); 
//    }
//
//    @Before
//    public void setUp() throws Exception {
//        String browser = ConfigReader.getBrowserType();
//        if (browser == null || browser.isEmpty()) {
//            throw new IllegalArgumentException("Browser type not specified in config.properties");
//        }
//
//        Driver_SetUp.initializeBrowser(browser);
//
//        String url = ConfigReader.getUrl();
//        if (url == null || url.isEmpty()) {
//            throw new IllegalArgumentException("URL not specified in config.properties");
//        }
//
//        Driver_SetUp.getDriver().get(url);
//    }
//
//    @After
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) Driver_SetUp.getDriver()).getScreenshotAs(OutputType.BYTES);
//            Allure.addAttachment(scenario.getName() + " - Screenshot", new ByteArrayInputStream(screenshot));
//        }
//
//        Driver_SetUp.closeDriver();
//    }
//}
