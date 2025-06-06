package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DriverManager.Driver_SetUp;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;

public class ArrayPom {

	WebDriver driver = Driver_SetUp.getDriver();

    
	ExcelReader excelReader = new ExcelReader();
	
	public By arrayGetStartedButton = By.xpath("//div[h5[text()='Array']]//a[text()='Get Started']");
	public By arraysInPythonLink = By.xpath("//a[@href='arrays-in-python']");
	public By arraysUsingListLink = By.xpath("//a[@href='arrays-using-list']");
	public By basicOperationsInListsLink = By.xpath("//a[@href='basic-operations-in-lists']");
	public By applicationsOfArrayLink = By.xpath("//a[@href='applications-of-array']");
	public By practiceQuestionsLink = By.linkText(("Practice Questions"));
	public By searchTheArrayLink = By.xpath("//a[@href='/question/1']");
	public By maxConsecutiveOnes = By.xpath("//a[@href='/question/2']");
	public By findNumWithEvenNumOfDigits = By.xpath("//a[@href='/question/3']");
	public By squaresOfAsortedArray = By.xpath("//a[@href='/question/4']");
	public By runButton = By.xpath("//button[text()='Run']");
	public By submitButton = By.xpath("/html/body/div/div/form/input[@type='submit']");
	
		
		public void clickarrayGetStartedBtn() {
			driver.findElement(arrayGetStartedButton).click();
			LoggerLoad.info("Clicking the Array Get Started link");
			
		}
		
		public void clickarraysInPythonLink() {
			driver.findElement(arraysInPythonLink).click();
			LoggerLoad.info("Clicking Arrays in Python link");
			
		}
		
		public void clickarraysUsingListLink() {
			driver.findElement(arraysUsingListLink).click();
			LoggerLoad.info("Clicking Arrays Using List link");
			
		}
		
		public void clickbasicOperationsInListsLink() {
			driver.findElement(basicOperationsInListsLink).click();
			LoggerLoad.info("Clicking Basic Operations In Lists link");
		}
		public void clickapplicationsOfArrayLink() {
			driver.findElement(applicationsOfArrayLink).click();
			LoggerLoad.info("Clicking Aplications Of Array link");
			
		}
		
		public void clickPracticeQuestionsLink() throws InterruptedException {
			driver.findElement(practiceQuestionsLink).click();
			LoggerLoad.info("Practice Questions link clicked");
		}
		
		public void clickSearchTheArrayLink() {
		    driver.findElement(searchTheArrayLink).click();
		    LoggerLoad.info("Clicking Search the Array link");
        }
		    
	    public void clickMaxConsecutiveOnes() {
		    driver.findElement(maxConsecutiveOnes).click();
	        LoggerLoad.info("Clicking Max Consecutive Ones link");
		}
	    
		public void clickFindNumWithEvenNumOfDigits() {
		    driver.findElement(findNumWithEvenNumOfDigits).click();
		    LoggerLoad.info("Clicking Find Numbers with Even Number of Digits link");
		}
		    
		public void clickSquaresOfASortedArray() {
		    driver.findElement(squaresOfAsortedArray).click();
		    LoggerLoad.info("Clicking Squares of a Sorted Array link");
		}
		
		
		    
		public String getTextForElement(By locator) {
		   String elementText = driver.findElement(locator).getText();
		   return elementText;
		}
}
