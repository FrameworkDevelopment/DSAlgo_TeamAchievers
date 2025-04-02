
package DriverManager;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import Utilities.LoggerLoad;

public class Driver_SetUp {

    
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    public static synchronized void initializeBrowser(String browser) throws Exception {
        if (threadDriver.get() == null) { 
            LoggerLoad.info("Initializing " + browser.toUpperCase() + " Driver for Thread: " + Thread.currentThread());

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
        }
    }

    public static synchronized WebDriver getDriver() {
        WebDriver driver = threadDriver.get();
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized! Call initializeBrowser() first.");
        }
        return driver;
    }

    public static synchronized void closeDriver() {
        WebDriver driver = threadDriver.get();
        if (driver != null) {
            driver.quit();
            threadDriver.remove();
            LoggerLoad.info("Closed browser for Thread: " + Thread.currentThread());
        }
    }
}
