package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverManager.Driver_SetUp;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;

public class LinkedListPom {
	

	WebDriver driver = Driver_SetUp.getDriver();
	ExcelReader excelReader = new ExcelReader();
	
	
	public By lsGetStartedBtn = By.cssSelector("a[href='linked-list']");
	public By lsIntroductionLink = By.xpath("//a[@href='introduction']");
	public By lsCreatingLinkedLIst = By.xpath("//a[@href='creating-linked-list']");
	public By lsTypesOfLinkedList = By.xpath("//a[@href='types-of-linked-list']");
	public By lsImplementLinkedListInPython = By.xpath("//a[@href='implement-linked-list-in-python']");
	public By lsTraversal = By.xpath("//a[@href='traversal']");
	public By lsInsertion = By.xpath("//a[@href='insertion-in-linked-list']");
	public By lsDeletion = By.xpath("//a[@href='deletion-in-linked-list']");
	public By lsPracticeQns = By.linkText("Practice Questions");

	public void clicklsGetStartedBtn() {
		driver.findElement(lsGetStartedBtn).click();
		LoggerLoad.info("Clicking the Linked List Get Started link");
		
	}

	public void clicklsIntroductionLink() {
		driver.findElement(lsIntroductionLink).click();
		LoggerLoad.info("Clicking the LinkedList-Introduction page link");
	}

	 public void clicklsCreatingLinkedLIstLink() {
	    driver.findElement(lsCreatingLinkedLIst).click();
	    LoggerLoad.info("Clicking the LinkedList-Creating Linked LIst page link");
			
		}
	 
	 public void clicklsTypesOfLinkedListLink() {
	   	driver.findElement(lsTypesOfLinkedList).click();
	    LoggerLoad.info("Clicking the LinkedList-Types Of Linked List page link");
			
		}
	 
	 public void clicklsImplementLinkedListInPythonLink() {
		driver.findElement(lsImplementLinkedListInPython).click();
	    LoggerLoad.info("Clicking the LinkedList-Implement Linked List in Python page link");
	 }
	 
	 public void clicklsTraversalLink() {
		driver.findElement(lsTraversal).click();
	    LoggerLoad.info("Clicking the LinkedList-Traversal page link");
	 }
	 
	 public void clicklsInsertionLink() {
		driver.findElement(lsInsertion).click();
	    LoggerLoad.info("Clicking the LinkedList-Insertion page link");
	 }
	 
	 public void clicklsDeletionLink() {
		driver.findElement(lsDeletion).click();
	    LoggerLoad.info("Clicking the LinkedList-Deletion page link");
	 }
	 
	 public void clickpracticequestions() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement practiceQns = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Practice Questions")));
			practiceQns.click();
		}
}
