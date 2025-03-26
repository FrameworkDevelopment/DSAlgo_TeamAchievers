package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.io.IOException;
import DriverManager.Driver_SetUp;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;

public class TryEditorPage {
	
   public WebDriver driver = Driver_SetUp.getDriver();

   
    private By codeEditorPage= By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre");
    public By runButton = By.xpath("//button[text()='Run']");
    private By consoleOutput = By.xpath("//pre[@id='output']");

    public void enterCode(String code) throws InterruptedException {
       
        Actions action = new Actions(driver);
        WebElement codeEditor = driver.findElement(codeEditorPage);

        Keys ctrlKey = Keys.CONTROL;  // 
        action.moveToElement(codeEditor)
              .click() 
              .keyDown(ctrlKey)              
              .sendKeys("a")                   
              .keyUp(ctrlKey)               
              .sendKeys(Keys.BACK_SPACE)       
              .perform();                      
  
        action.sendKeys(code).perform();
    }

    public void clickRunButton() {
    	
        TryEditorPage tep = new TryEditorPage();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(runButton));
        button.click();

        tep.isAlertPresent();
    }

     public String isAlertPresent() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert text: " + alertText);
            alert.accept();
            return alertText;
        } catch (NoAlertPresentException e) {
        	LoggerLoad.info("No alert present.");
            return null;
        }
    }

    public boolean isConsoleOutputDisplayed() {
        WebElement consoleElement = driver.findElement(consoleOutput);
        String outputText = consoleElement.getText();
        LoggerLoad.info(outputText);
        return consoleElement.isDisplayed();
    }
    public String getConsoleOutputText() {
        return driver.findElement(consoleOutput).getText();
    }

   public void testValidCodeExecution() throws IOException, InterruptedException {
       String validCode = ExcelReader.getCodeFromExcel("src/test/resources/TestData.xlsx", "Sheet1", 1, 0);

        Actions action = new Actions(driver);
        WebElement element2 = driver.findElement(codeEditorPage);

        LoggerLoad.info("In the method valid code");

        Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
        new Actions(driver)
            .sendKeys(element2, "Selenium!")   
            .sendKeys(Keys.ARROW_LEFT)          
            .keyDown(Keys.SHIFT)                
            .sendKeys(Keys.ARROW_UP)            
            .keyUp(Keys.SHIFT)                  
            .keyDown(cmdCtrl)                   
            .sendKeys("a")                       
            .keyUp(cmdCtrl)                     
            .sendKeys(Keys.BACK_SPACE)           
            .perform();                          

        enterCode(validCode);
        clickRunButton();
    }

     public void testInvalidCodeExecution() throws IOException, InterruptedException {
        String invalidCode = ExcelReader.getCodeFromExcel("src/test/resources/TestData.xlsx", "Sheet1", 2, 0);
        LoggerLoad.info("Invalid code: " + invalidCode);

        enterCode(invalidCode);
        clickRunButton();
    }

     public static void main(String[] args) throws InterruptedException {
        TryEditorPage tep = new TryEditorPage();
    }
}
