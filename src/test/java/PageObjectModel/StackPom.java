package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverManager.Driver_SetUp;

public class StackPom {

	
public WebDriver driver = Driver_SetUp.getDriver();
	
private	By Stack_getStarted = By.xpath("//a[@href='stack']");
	
private By OperationsinStack = By.linkText("Operations in Stack");
private	 By clickTryhere = By.linkText("Try here>>>");

private		By StackRepresent = By.linkText("Implementation");
private		By StackApplications = By.linkText("Applications");
private		By StackPractice =  By.linkText("Practice Questions");



public void getStartedStack() throws InterruptedException {
	
	System.out.println("trying to get into Stack page");
	
	driver.findElement(Stack_getStarted).click();

}

public void operationsinStack() throws InterruptedException {
	
	
	
	driver.findElement(OperationsinStack).click();

}
public void clickTryhere() throws InterruptedException {
	
	
	
	driver.findElement(clickTryhere).click();
}

public void StackRepresent() throws InterruptedException {
	
	
	
	driver.findElement(StackRepresent).click();

}
public void StackApplications() throws InterruptedException {
	
	
	
	driver.findElement(StackApplications).click();

}



public void StackPractice() throws InterruptedException {
	
	
	
	driver.findElement(StackPractice).click();

}
}
