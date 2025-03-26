package StepDefinitions;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import DriverManager.Driver_SetUp;
import PageObjectModel.DataStructureIntroPom;
import PageObjectModel.HomePom;
import PageObjectModel.IntroductionPagePom;
import PageObjectModel.LoginPom;
import PageObjectModel.ScrollAndClick;
import PageObjectModel.TryEditorDsPom;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.*;

public class Step_DataStructurePage {

	public WebDriver driver = Driver_SetUp.getDriver();
	ExcelReader excelReader = new ExcelReader();

	public DataStructureIntroPom dsIntro = new DataStructureIntroPom();
	public HomePom hp = new HomePom();
	public TryEditorDsPom tp = new TryEditorDsPom();
	public IntroductionPagePom ip = new IntroductionPagePom();
	public LoginPom login = new LoginPom();
	public ScrollAndClick sc = new ScrollAndClick(driver);

	//TC01 
//	@Given("The user is landed on the home page after sign-in")
//	public void the_user_is_landed_on_the_home_page_after_sign_in()
//			throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
//		hp.openURL();
//		
//	}
	
//TC01
	@When("The user clicks the Get Started button of Data Structure Introduction section")
	public void the_user_clicks_the_get_started_button_of_data_structure_introduction_section() throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		dsIntro.clickGetStartedBtn();
	}

	@Then("The user should be directed to  Data Structure introduction Page")
	public void the_user_should_be_directed_to_data_structure_introduction_page() throws InterruptedException {
		
		Assert.assertTrue(dsIntro.validateElementDisplayed(dsIntro.dsPageTitle));
		Assert.assertEquals(dsIntro.getTextForElement(dsIntro.dsPageTitle), "Data Structures-Introduction");
		LoggerLoad.info("title is+" + "Data Structures-Introduction");
		Thread.sleep(10);
	}

//TC02
	
	@When("The user clicks on Time Complexity link of DS Introduction page")
	public void the_user_clicks_on_time_complexity_link_of_ds_introduction_page() throws InterruptedException {
		dsIntro.clickGetStartedBtn();
	    sc.clickTimeComplexityLink();
	}

	@Then("The user should be directed to Time Complexity page of DS Intro page")
	public void the_user_should_be_directed_to_time_complexity_page_of_ds_intro_page() {
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.toLowerCase().contains("Time Complexity".toLowerCase()),
			"Page title does not contain 'Time Complexity' . Found: " + pageTitle);
		LoggerLoad.info("title is+" + pageTitle);
	}
	
}
//TC03

//	//TC02
//	@Given("The user is on the Data Structure introduction Page of ds algo portal after sign in")
//	public void the_user_is_on_the_data_structure_introduction_page_of_ds_algo_portal_after_sign_in() {
//		hp.openDSIntroductionUrl();
//	}
//
//	@When("The user clicks on Time Complexity link of DS Introduction page")
//	public void the_user_clicks_on_time_complexity_link_of_ds_introduction_page() {
//		dsIntro.clickTimeComplexityLink();
//	}
//
//	@Then("The user should be directed to Time Complexity page of DS Intro page")
//	public void the_user_should_be_directed_to_time_complexity_page_of_ds_intro_page() {
//
//		String pageTitle = driver.getTitle();
//		System.out.println("title is+" + pageTitle);
//		Assert.assertTrue(pageTitle.toLowerCase().contains("Time Complexity".toLowerCase()),
//				"Page title does not contain 'Time Complexity' . Found: " + pageTitle);
//	}

//	// TC03
//	@Given("The user is on the Time Complexity Page of DS Introduction page")
//	public void the_user_is_on_the_time_complexity_page_of_ds_introduction_page() {
//		String pageTitle = driver.getTitle();
//		LoggerLoad.info("title is+" + pageTitle);
//		
//		Assert.assertTrue(pageTitle.toLowerCase().contains("Time Complexity".toLowerCase()),
//				"Page title does not contain 'Time Complexity' . Found: " + pageTitle);
//	}
//
//	@When("The user clicks on Try here button of Time Complexity Page")
//	public void the_user_clicks_on_try_here_button_of_time_complexity_page() {
//		tp.clickTryHereBtn();
//	}
//
//	@Then("The user should be directed to a page having Editor with run button")
//	public void the_user_should_be_directed_to_a_page_having_editor_with_run_button() {
//		Assert.assertEquals(ip.getPageTitle(), "Assessment");
//		Assert.assertTrue(ip.validateElementDisplayed(tp.runButton));
//	}
//
//	// TC04
//	@Given("The user is in the tryEditor page of Time Complexity page")
//	public void the_user_is_in_the_try_editor_page_of_time_complexity_page() {
//		Assert.assertEquals(ip.getPageTitle(), "Assessment");
//		Assert.assertTrue(ip.validateElementDisplayed(tp.runButton));
//	}
//
//	@When("The user clicks the Run button without entering the code in the text area editor")
//	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_text_area_editor() {
//		tp.clickRunButton();
//	}
//
//	@Then("The user does not see any error message displayed")
//	public void the_user_does_not_see_any_error_message_displayed() {
//		Assert.assertEquals(false, tp.isAlertPresent());
//	}
//
//    //TC05
//	@When("The user clicks Run button with invalidcode from sheetname {string} and row {int}")
//	public void the_user_clicks_run_button_with_invalidcode_from_sheetname_and_row(String string, Integer int1)
//			throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
//
//		try {
//			
//			tp.enterTryHereCode("tryEditorCode", 1);
//			tp.clickRunButton();
//		} catch (Exception e) {
//			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
//		}
//	}
//
//	@Then("The user should able to see an error message in alert window")
//	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
//		
//		Assert.assertEquals(true, tp.handleAlert());
//
//	}
//	// TC06
//
//	@When("The user clicks Run button with valid code from sheetname {string} and row {int}")
//	public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row(String string, Integer int1) {
//
//		try {
//			
//			tp.enterTryHereCode("tryEditorCode", 0);
//			tp.clickRunButton();
//		} catch (Exception e) {
//			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
//		}
//	}
//
//	@Then("The user should able to see output in the console")
//	public void the_user_should_able_to_see_output_in_the_console() {
//
//		String consoleOutput = tp.getOutputText();
//		Assert.assertNotNull(consoleOutput, "Console output should not be null.");
//		LoggerLoad.info("Console output: " + consoleOutput);
//		Assert.assertNotNull(tp.getOutputText());
//
//	}
//
//	// TC07
//	@When("The user clicks Practice Questions link of DS page")
//	public void the_user_clicks_practice_questions_link_of_ds_page() {
//		hp.openPracticeQnsPageUrl();
//	}
//
//	@Then("The user should be redirected to Practice Questions page  of DS")
//	public void the_user_should_be_redirected_to_practice_questions_page_of_ds() {
//		LoggerLoad.info("dsIntro.validatePageTitle()-------->" + dsIntro.validatePageTitle());
//		
//		// Assert.assertEquals("Practice Questions", dsIntro.validatePageTitle());
//		Assert.assertEquals(dsIntro.validatePageTitle(), "Assessment");
//	}
//		
//}
