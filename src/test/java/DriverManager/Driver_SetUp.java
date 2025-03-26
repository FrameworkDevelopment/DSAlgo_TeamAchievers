package DriverManager;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utilities.LoggerLoad;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver_SetUp {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static WebDriver initializeBrowser(String browser) throws Exception {

        if (threadDriver.get() != null) {
            return threadDriver.get();  
        }

        WebDriver driver;

        switch (browser.toLowerCase()) {
        case "chrome":
        	driver = new ChromeDriver();
            break;
        case "firefox":
        	driver = new FirefoxDriver();
            break;
        case "edge":
            driver = new EdgeDriver();
            break;
        default:
            throw new Exception("Unsupported browser: " + browser);
    }
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

       threadDriver.set(driver);         
        return threadDriver.get();
    }

    public static void closeDriver() {
        WebDriver driver = threadDriver.get();
        if (driver != null) {
            driver.quit(); 
            threadDriver.remove(); 
            LoggerLoad.info("Close");
        }
    }

    public static synchronized WebDriver getDriver() {
        return threadDriver.get();
    }
	
}

