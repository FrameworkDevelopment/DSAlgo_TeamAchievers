package PageObjectModel;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import DriverManager.Driver_SetUp;
import Utilities.ConfigReader;
import Utilities.LoggerLoad;

public class HomePom {
	
	public WebDriver driver = Driver_SetUp.getDriver();
    
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 

	public By getStartedButton = By.cssSelector("button.btn");
	public By contentHeader = By.cssSelector(".content h1");
	
	public By contentText = By.cssSelector("div.content p");
	public By signOutLink = By.xpath("//a[@href='/logout']");

	public void openURL() {
		driver.get(ConfigReader.getUrl());
		LoggerLoad.info("Inside openURL");

	}
	
	public void openDsTimeComplexityUrl() {
		driver.get(ConfigReader.geturlTimeComplexity());
	}

	public void openDSIntroductionUrl() {
		driver.get(ConfigReader.geturlDataStructuresIntroduction());
	}
	public void openPracticeQnsPageUrl() {
			driver.get(ConfigReader.geturlPracticeQnsDSIntroPage());
	}

	public void ClickHomePageGetStartedButton() {
		driver.findElement(getStartedButton).click();
		LoggerLoad.info("Before ClickHomePageGetStartedButton");
	}

	public WebElement linkClickable(By locator) {
    	return wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	
    public void openHomeURL() {
    	driver.get(ConfigReader.getUrlHome());
    	LoggerLoad.info("Inside openURL");
    		
    }
    public void openUrlTree() {
    	driver.get(ConfigReader.getUrlTree());
    		
    }
    public void openUrlGraph(){
    	driver.get(ConfigReader.getUrlGraph());
    	
    }
    

    public void openUrlQueue() {
	
    	driver.get(ConfigReader.getUrlQueue());
		
	}
    
      
 	public String getTextForElement(By locator) {
		String elementText = driver.findElement(locator).getText();
		return elementText;
	}

    public void openLinkedList() {
    	driver.get(ConfigReader.getUrlLinkedList());
    }
    
    public void openArray() {
    	
    	driver.get(ConfigReader.getUrlArray());
    }


	
	public void clickSignOutLink() {
		driver.findElement(signOutLink).click();
	}


	public void openUrlStack() {
		
    	driver.get(ConfigReader.getUrlStack());
		
	}
	

}

	