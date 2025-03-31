package DriverManager;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import Utilities.LoggerLoad;

public class Driver_SetUp {

    // ThreadLocal to ensure isolated browser sessions for parallel execution
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    public static synchronized WebDriver initializeBrowser(String browser) throws Exception {
        if (threadDriver.get() == null) { // Ensure a new driver per thread
            LoggerLoad.info("Initializing " + browser.toUpperCase() + " Driver for Thread: " + Thread.currentThread().getId());

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

            // Set WebDriver configurations
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            threadDriver.set(driver); // Store WebDriver instance in ThreadLocal
        }
        return threadDriver.get();
    }

    public static synchronized void closeDriver() {
        WebDriver driver = threadDriver.get();
        if (driver != null) {
            driver.quit();
            threadDriver.remove();
            LoggerLoad.info("Closed browser for Thread: " + Thread.currentThread().getId());
        }
    }

    public static WebDriver getDriver() {
        return threadDriver.get();
    }
}











































//package DriverManager;
//
//import java.time.Duration;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import Utilities.LoggerLoad;
//
//public class Driver_SetUp {
//
//    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
//
//    public static WebDriver initializeBrowser(String browser) throws Exception {
//	
//        if (threadDriver.get() == null) { // Ensure new driver per thread
//            LoggerLoad.info("Initializing " + browser.toUpperCase() + " Driver for Thread: " + Thread.currentThread().getId());
//
//            switch (browser.toLowerCase()) {
//                case "chrome":
//                    threadDriver.set(new ChromeDriver());
//                    break;
//                case "firefox":
//                    threadDriver.set(new FirefoxDriver());
//                    break;
//                case "edge":
//                    threadDriver.set(new EdgeDriver());
//                    break;
//                default:
//                    throw new Exception("Unsupported browser: " + browser);
//            }
//
//            WebDriver driver = threadDriver.get();
//            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
//        }
//        return threadDriver.get();
//    }
//
//    public static void closeDriver() {
//        WebDriver driver = threadDriver.get();
//        if (driver != null) {
//            driver.quit();
//            threadDriver.remove();
//            LoggerLoad.info("Closed browser for Thread: " + Thread.currentThread().getId());
//        }
//    }
//
//    public static WebDriver getDriver() {
//        return threadDriver.get();
//    }
//}
