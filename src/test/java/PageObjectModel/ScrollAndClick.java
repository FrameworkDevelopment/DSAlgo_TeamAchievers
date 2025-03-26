package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ConfigReader;

public class ScrollAndClick {
	
	WebDriver driver;

    public ScrollAndClick(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickTimeComplexityLink() {
        // Scroll to the bottom of the page to ensure the link is visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement timeComplexityLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Time Complexity")));

        // Scroll to the specific element (Time Complexity link)
        js.executeScript("arguments[0].scrollIntoView(true);", timeComplexityLink);

        // Click the "Time Complexity" link
        timeComplexityLink.click();
    }
    
    public void navigateToTimeComplexityPage() {
        // Get base URL and time complexity page URL from config
        String baseUrl = ConfigReader.getProperty("base.url");
        String timeComplexityUrl = ConfigReader.getProperty("time.complexity.url");

        // Concatenate to form the full URL
        String fullUrl = baseUrl + timeComplexityUrl;

        // Navigate to the URL
        driver.get(fullUrl);
    }

}


