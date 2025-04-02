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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
	@When("The user clicks the Get Started button of Data Structure Introduction section")
	public void the_user_clicks_the_get_started_button_of_data_structure_introduction_section()
			throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		dsIntro.clickGetStartedBtn();
	}

	@Then("The user should be directed to  Data Structure introduction Page")
	public void the_user_should_be_directed_to_data_structure_introduction_page() throws InterruptedException {

		Assert.assertTrue(dsIntro.validateElementDisplayed(dsIntro.dsPageTitle));
		Assert.assertEquals(dsIntro.getTextForElement(dsIntro.dsPageTitle), "Data Structures-Introduction");
		LoggerLoad.info("title is+" + "Data Structures-Introduction");

	}

//TC02

	@When("The user clicks on Time Complexity link of DS Introduction page")
	public void the_user_clicks_on_time_complexity_link_of_ds_introduction_page() throws InterruptedException {
		dsIntro.clickGetStartedBtn();
		LoggerLoad.info("Data Structures - Get Started button is clicked");
		Thread.sleep(10);
		sc.clickTimeComplexityLink();
		LoggerLoad.info("Time Complexity Link is clicked");
	}

	@Then("The user should be directed to Time Complexity page of DS Intro page")
	public void the_user_should_be_directed_to_time_complexity_page_of_ds_intro_page() {
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.contains("Time Complexity"),
				"Page title does not contain 'Time Complexity'. Found: " + pageTitle);
		LoggerLoad.info("Title is: " + pageTitle);
	}

//TC03

	@When("The user clicks on Try here button of Time Complexity Page")
	public void the_user_clicks_on_try_here_button_of_time_complexity_page() {
		dsIntro.clickGetStartedBtn();
		LoggerLoad.info("DS Get Started Btn Clicked");
		sc.clickTimeComplexityLink();
		LoggerLoad.info("TimeComplexity Link Clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("Try Here Button Clicked");

	}

	@Then("The user should be directed to a page having Editor with run button")
	public void the_user_should_be_directed_to_a_page_having_editor_with_run_button() {
		Assert.assertEquals(ip.getPageTitle(), "Assessment");
		Assert.assertTrue(ip.validateElementDisplayed(tp.runButton));
	}

//TC04

	@When("The user clicks the Run button without entering the code in the text area editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_text_area_editor() {
		dsIntro.clickGetStartedBtn();
		LoggerLoad.info("DS Get Started Btn Clicked");
		sc.clickTimeComplexityLink();
		LoggerLoad.info("TimeComplexity Link Clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("Try Here Button Clicked");
		tp.clickRunButton();
		LoggerLoad.info("Run Button Clicked");

	}

	@Then("The user does not see any error message displayed")
	public void the_user_does_not_see_any_error_message_displayed() {
		Assert.assertEquals(false, tp.isAlertPresent());
	}

	// TC05
	@When("The user clicks Run button with invalidcode from sheetname {string} and row {int}")
	public void the_user_clicks_run_button_with_invalidcode_from_sheetname_and_row(String string, Integer int1) {
		dsIntro.clickGetStartedBtn();
		LoggerLoad.info("DS Get Started Btn Clicked");
		sc.clickTimeComplexityLink();
		LoggerLoad.info("TimeComplexity Link Clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("Try Here Button Clicked");

		try {

			tp.enterTryHereCode("tryEditorCode", 1);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		Assert.assertEquals(true, tp.handleAlert());
		LoggerLoad.info("Alert displayed");
	}

//TC06

	@When("The user clicks Run button with valid code from sheetname {string} and row {int}")
	public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row(String string, Integer int1) {
		dsIntro.clickGetStartedBtn();
		LoggerLoad.info("DS Get Started Btn Clicked");
		sc.clickTimeComplexityLink();
		LoggerLoad.info("TimeComplexity Link Clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("Try Here Button Clicked");

		try {

			tp.enterTryHereCode("tryEditorCode", 0);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		String consoleOutput = tp.getOutputText();
		Assert.assertNotNull(consoleOutput, "Console output should not be null.");
		LoggerLoad.info("Console output: " + consoleOutput);
		Assert.assertNotNull(tp.getOutputText());
	}

	// TC07

	@When("The user clicks Practice Questions link of DS page")
	public void the_user_clicks_practice_questions_link_of_ds_page() {
		dsIntro.clickGetStartedBtn();
		sc.clickTimeComplexityLink();
		dsIntro.clickPracticeQuestionsLink();
	}

	@Then("The user should be redirected to Practice Questions page  of DS")
	public void the_user_should_be_redirected_to_practice_questions_page_of_ds() {
		
	Assert.assertEquals("Assessment", dsIntro.validatePageTitle());		
	LoggerLoad.info("dsIntro.validatePageTitle()->" + dsIntro.validatePageTitle());
		
		}
				
	}

