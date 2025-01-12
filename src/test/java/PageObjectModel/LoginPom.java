package PageObjectModel;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import DriverManager.Driver_SetUp;
import Utilities.ExcelReader;

public class LoginPom {
	
	WebDriver driver = Driver_SetUp.getDriver();
	ExcelReader excelReader = new ExcelReader();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//X paths for web elements on login page 
	
//	public By usernameTextBox = By.xpath("//input[@name='username']"); // user name text box field
//	public By passwordTextBox = By.xpath("//input[@name='password']"); // password text box field
//	public By loginBtn = By.xpath("//input[@type='submit' and @value='Login']"); // login button 
//	public By alertMsg = By.xpath("//div[@class='alert alert-primary']"); // alert message 
	
	public By usernameTextBox = By.id("id_username");
	public By passwordTextBox = By.id("id_password");
	public By loginBtn =   By.xpath("//input[@value='Login']");
	public By alertMsg = By.cssSelector(".alert.alert-primary");
	
	//enter user name text box 
	public void enterUsernameTxt(String username) {
		driver.findElement(usernameTextBox).sendKeys(username);
		
	}
	//enter password text box
	public void enterPasswordTxt(String password) {
	    	driver.findElement(passwordTextBox).sendKeys(password);
	    }
	//click login button 
	public void clickloginBtn() {
	    	driver.findElement(loginBtn).click();
	    }
	
	//Login with valid user and password details 
	 public void loginWithValidCredentials(String username, String password) throws InterruptedException {
	    	driver.findElement(usernameTextBox).sendKeys(username);
	    	driver.findElement(passwordTextBox).sendKeys(password);
	    	driver.findElement(loginBtn).click();
	    }
	 
	public void passwordTextField(String password) {
			driver.findElement(passwordTextBox).sendKeys(password);
		}

		public void enterLoginFormFields(String sheetname, int row)
				throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
			System.out.println("Inside enterLoginFormFields");
			List<Map<String, String>> testdata = excelReader.getData("src/test/resources/Excel/TestData.xlsx", sheetname);
			System.out.println("logintestdata ---------> "+testdata);
			
			//Fetch and log the user name
			String username = testdata.get(row).get("username");
			System.out.println("Fetched username from Excel: " + username);
			enterUsernameTxt(username);
			
			//Fetch and log the password (optional, sensitive data warning)			
			String password = testdata.get(row).get("password");
			System.out.println("Fetched password from Excel: " + password);
			enterPasswordTxt(password);
		}	

}
