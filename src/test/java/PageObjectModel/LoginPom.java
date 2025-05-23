

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
import Utilities.LoggerLoad;

public class LoginPom {

	WebDriver driver = Driver_SetUp.getDriver();
	ExcelReader excelReader = new ExcelReader();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		
	public By usernameTextBox = By.id("id_username");
	public By passwordTextBox = By.id("id_password");
	public By loginBtn =   By.xpath("//input[@value='Login']");
	public By alertMsg = By.cssSelector(".alert.alert-primary");
	
	
	public void enterUsernameTxt(String username) {
		driver.findElement(usernameTextBox).sendKeys(username);
		
	}
	public void enterPasswordTxt(String password) {
	    	driver.findElement(passwordTextBox).sendKeys(password);
	    }
	public void clickloginBtn() {
	    	driver.findElement(loginBtn).click();
	    }
	
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
			LoggerLoad.info("Inside enterLoginFormFields");
	
			List<Map<String, String>> testdata = excelReader.readFromExcel("src/test/resources/Excel/TestData.xlsx", sheetname);
			LoggerLoad.info("logintestdata");
		
			
			String username = testdata.get(row).get("username");
			enterUsernameTxt(username);
			LoggerLoad.info("Fetched username from Excel: " + username);
			
			String password = testdata.get(row).get("password");
			LoggerLoad.info("Fetched password from Excel: " + password);
			enterPasswordTxt(password);
		}	

}
