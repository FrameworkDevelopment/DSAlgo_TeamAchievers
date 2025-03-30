package StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import DriverManager.Driver_SetUp;
import PageObjectModel.ArrayPom;
import PageObjectModel.DataStructureIntroPom;
import PageObjectModel.HomePom;
import PageObjectModel.IntroductionPagePom;
import PageObjectModel.TreePom;
import PageObjectModel.TryEditorDsPom;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.*;

public class Step_ArrayPage {
	
	public WebDriver driver = Driver_SetUp.getDriver();
	ExcelReader excelReader = new ExcelReader();
	
	public DataStructureIntroPom dsIntro = new DataStructureIntroPom();
	public ArrayPom ap = new ArrayPom();
	public IntroductionPagePom ip = new IntroductionPagePom();
	public TryEditorDsPom tp = new TryEditorDsPom();
	public HomePom hp = new HomePom();
	TreePom treePage = new TreePom();

//Background step
@When("The user clicks the Getting Started button in Array Panel")
public void the_user_clicks_the_getting_started_button_in_array_panel() {
 ap.clickarrayGetStartedBtn();
 LoggerLoad.info("Array Get Started Button Clicked");
}

//TC01
@Then("The user should be redirected to Array page")
public void the_user_should_be_redirected_to_array_page() {
    Assert.assertEquals("Array", dsIntro.validatePageTitle());
    LoggerLoad.info("title is+" + "Array");
 	
}

// --------------------------- (Arrays in Python)---------------------------

//TC02
@When("The user clicks the Arrays in Python link")
public void the_user_clicks_the_arrays_in_python_link() {
   ap.clickarraysInPythonLink();
   LoggerLoad.info("Arrays in Python link Clicked");
}

@Then("The user should be redirected to Arrays in Python page")
public void the_user_should_be_redirected_to_arrays_in_python_page() {
	Assert.assertEquals("Arrays in Python", dsIntro.validatePageTitle());
	LoggerLoad.info("title is+" + "Arrays in Python");
}
//TC03
@When("The user clicks Try Here button in Arrays in Python page")
public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	ap.clickarraysInPythonLink();
   	tp.clickTryHereBtn();
}

//Then - executed from Linked List feature -> reused the Then method for validation .

//TC04
@When("The user clicks the Run button without entering the code in the code Editor")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_code_editor() {
	ap.clickarraysInPythonLink();
   	tp.clickTryHereBtn();
	tp.clickRunButton();
	LoggerLoad.info("Run Button clicked");
}

@Then("The user should not see any error message in the popup")
public void the_user_should_not_see_any_error_message_in_the_popup() {
	Assert.assertEquals(false, tp.isAlertPresent());
	LoggerLoad.info("No Error message displayed");
}

//TC05
@When("The user clicks Run button with invalid code from sheetname {string} and row {int}")
public void the_user_clicks_run_button_with_invalid_code_from_sheetname_and_row(String string, Integer int1) {
	ap.clickarraysInPythonLink();
	LoggerLoad.info("Arrays In Python Clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button Clicked");

	try {

		tp.enterTryHereCode("tryEditorCode", 1);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}

}

@Then("The user should be able to see an error message in alert window")
public boolean the_user_should_be_able_to_see_an_error_message_in_alert_window() {
	//Assert.assertEquals(true, tp.handleAlert());
	 try {
         Alert alert = driver.switchTo().alert();
         System.out.println("Alert found: " + alert.getText());
         alert.accept();  // Click OK on the alert
         return true;
     } catch (NoAlertPresentException e) {
         System.out.println("No alert found.");
         return false;
     }
	
}
//TC06
@When("The user clicks Run button with the valid code from sheetname {string} and row {int}")
public void the_user_clicks_run_button_with_the_valid_code_from_sheetname_and_row(String string, Integer int1) {
	ap.clickarraysInPythonLink();
	LoggerLoad.info("Arrays In Python Clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button Clicked");

	try {

		tp.enterTryHereCode("tryEditorCode", 0);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}

}
//Then - called thru existing step def and methods from POM files

// --------------------------- (Arrays Using List)---------------------------

//TC07
@When("The user clicks the Arrays Using List link")
public void the_user_clicks_the_arrays_using_list_link() {
  ap.clickarraysUsingListLink();
}

@Then("The user should be redirected to Arrays Using List page")
public void the_user_should_be_redirected_to_arrays_using_list_page() {
	Assert.assertEquals("Arrays Using List", dsIntro.validatePageTitle());
	LoggerLoad.info("title is+" + "Arrays Using List");
	
	}

//TC08
@When("The user clicks Try Here button in Arrays Using List page")
public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
	ap.clickarraysUsingListLink();
	tp.clickTryHereBtn();
}
//Then - executed from Linked List feature -> reused the Then method for validation .

//TC09
@When("The user clicks the Run button without entering the code in the Editor for Arrays Using List section")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_arrays_using_list_section() {
	ap.clickarraysUsingListLink();
   	tp.clickTryHereBtn();
	tp.clickRunButton();
	LoggerLoad.info("Run Button clicked");
}
//Then - called thru reusable step def and methods 

//TC10

@When("The user clicks Run button with invalidcode from sheetname {string} and row {int} for Arrays Using List page")
public void the_user_clicks_run_button_with_invalidcode_from_sheetname_and_row_for_arrays_using_list_page(String string, Integer int1) {
	ap.clickarraysUsingListLink();
	LoggerLoad.info("Arrays Using List link Clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button Clicked");
	
	try {
			tp.enterTryHereCode("tryEditorCode", 1);
			tp.clickRunButton();
		} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
}
//Then - called thru reusable step def and methods 

//TC11
@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Arrays Using List page")
public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_arrays_using_list_page(String string, Integer int1) {
	ap.clickarraysUsingListLink();
	LoggerLoad.info("Arrays Using List link Clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button Clicked");

	try {

		tp.enterTryHereCode("tryEditorCode", 0);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}

//--------------------------- (Basic Operations in Lists)---------------------------

//TC12
@When("The user clicks the Basic Operations in Lists link")
public void the_user_clicks_the_basic_operations_in_lists_link() {
ap.clickbasicOperationsInListsLink();
LoggerLoad.info("Basic Operations in Lists-link Clicked");
}

@Then("The user should be redirected to Basic Operations in Lists page")
public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
	Assert.assertEquals("Basic Operations in Lists", dsIntro.validatePageTitle());
	LoggerLoad.info("title is+" + "Basic Operations in Lists");
}

//TC13
@When("The user clicks Try Here button in Basic Operations in Lists page")
public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
    ap.clickbasicOperationsInListsLink();
	tp.clickTryHereBtn();
}

//Then - called thru reusable step def and methods 

//TC14
@When("The user clicks the Run button without entering the code in the Editor for Basic Operations in Lists section")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_basic_operations_in_lists_section() {
	ap.clickbasicOperationsInListsLink();
   	tp.clickTryHereBtn();
	tp.clickRunButton();
	LoggerLoad.info("Run Button clicked");
}

//Then - called thru reusable step def and methods 

//TC15
@When("The user clicks Run button with invalidcode from sheetname {string} and row {int} for Basic Operations in Lists page")
public void the_user_clicks_run_button_with_invalidcode_from_sheetname_and_row_for_basic_operations_in_lists_page(String string, Integer int1) {
	ap.clickbasicOperationsInListsLink();
	LoggerLoad.info("Basic Operations in Lists Clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button Clicked");

	try {

		tp.enterTryHereCode("tryEditorCode", 1);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}

//TC16
@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Basic Operations in Lists page")
public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_basic_operations_in_lists_page(String string, Integer int1) {
	ap.clickbasicOperationsInListsLink();
	LoggerLoad.info("Basic Operations in Lists Clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button Clicked");

	try {

		tp.enterTryHereCode("tryEditorCode", 0);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}

//Then - called thru reusable step def and methods 

//--------------------------- (Applications of Array)---------------------------

//TC17 
@When("The user clicks the Applications of Array link")
public void the_user_clicks_the_applications_of_array_link() {
	ap.clickapplicationsOfArrayLink();
}

@Then("The user should be redirected to Applications of Array page")
public void the_user_should_be_redirected_to_applications_of_array_page() {
	Assert.assertEquals("Applications of Array", dsIntro.validatePageTitle());
	LoggerLoad.info("title is+" + "Applications of Array");
}

//TC18
@When("The user clicks Try Here button in Applications of Array page")
public void the_user_clicks_try_here_button_in_applications_of_array_page() throws InterruptedException {
	ap.clickapplicationsOfArrayLink();
	tp.clickTryHereBtn();
	
}

//TC19
@When("The user clicks the Run button without entering the code in the Editor for Applications of Array section")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_applications_of_array_section() {
	ap.clickapplicationsOfArrayLink();
	tp.clickTryHereBtn();
	tp.clickRunButton();
	LoggerLoad.info("Run Button clicked");
	
}

//TC20
@When("The user clicks Run button with invalidcode from sheetname {string} and row {int} for Applications of Array page")
public void the_user_clicks_run_button_with_invalidcode_from_sheetname_and_row_for_applications_of_array_page(String string, Integer int1) {
	ap.clickapplicationsOfArrayLink();
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button Clicked");
	
	try {
			tp.enterTryHereCode("tryEditorCode", 1);
			tp.clickRunButton();
		} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
}
//TC21
@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Applications of Array page")
public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_applications_of_array_page(String string, Integer int1) {
	ap.clickapplicationsOfArrayLink();
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button Clicked");
	
	try {
			tp.enterTryHereCode("tryEditorCode", 0);
			tp.clickRunButton();
		} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
}

//--------------------------- (Practice Questions Validations)------------------------------------------------------

//TC22
@When("The user clicks Practice Questions link of Array page")
public void the_user_clicks_practice_questions_link_of_array_page() throws InterruptedException {
	ap.clickapplicationsOfArrayLink();
	LoggerLoad.info("Applications of Array link clicked");
	ap.clickPracticeQuestionsLink();
	LoggerLoad.info("Practice Questions Link Clicked");
}

@Then("The user should be redirected to page with four Practice Questions")
public void the_user_should_be_redirected_to_page_with_four_practice_questions() {
	Assert.assertEquals(hp.getTextForElement(ap.searchTheArrayLink), "Search the array");
	Assert.assertEquals(hp.getTextForElement(ap.maxConsecutiveOnes), "Max Consecutive Ones");
	Assert.assertEquals(hp.getTextForElement(ap.findNumWithEvenNumOfDigits), "Find Numbers with Even Number of Digits");
	Assert.assertEquals(hp.getTextForElement(ap.squaresOfAsortedArray), "Squares of a Sorted Array");
}
//TC23
@When("The user clicks Search the array page Question link")
public void the_user_clicks_search_the_array_page_question_link() throws InterruptedException {
	ap.clickapplicationsOfArrayLink();
	LoggerLoad.info("Applications of Array link clicked");
	ap.clickPracticeQuestionsLink();
	LoggerLoad.info("Practice Questions Link Clicked");
	ap.clickSearchTheArrayLink();
	LoggerLoad.info("Search the array Link Clicked");
}

@Then("The user should be redirected to try Editor page with a Run and Submit buttons")
public void the_user_should_be_redirected_to_try_editor_page_with_a_run_and_submit_buttons() {
	Assert.assertTrue(ip.validateElementDisplayed(ap.runButton));
	LoggerLoad.info("Run Button displayed");
	Assert.assertTrue(ip.validateElementDisplayed(ap.submitButton));
	LoggerLoad.info("Submit Button displayed");
}
//TC24
}
//
//
//
////TC19, TC20, TC21 --> ran through existing methods and step def steps
//
////Practice Questions page of Array --> Validations 
//
////TC22
////Given and When -> called from existing methods
//
//@Then("The user should be redirected to page with four Practice Questions of Arrays in Python page")
//public void the_user_should_be_redirected_to_page_with_four_practice_questions_of_arrays_in_python_page() {
//
//	Assert.assertEquals(hp.getTextForElement(ap.searchTheArrayLink), "Search the array");
//	Assert.assertEquals(hp.getTextForElement(ap.maxConsecutiveOnes), "Max Consecutive Ones");
//	Assert.assertEquals(hp.getTextForElement(ap.findNumWithEvenNumOfDigits), "Find Numbers with Even Number of Digits");
//	Assert.assertEquals(hp.getTextForElement(ap.squaresOfAsortedArray), "Squares of a Sorted Array");
//}
//
////TC23
//	
//	@When("The user clicks Search the array page link")
//	public void the_user_clicks_search_the_array_page_link() {
//	    ap.clickSearchTheArrayLink();
//	}
////TC24 , TC25 --> ran through existing methods and step def 
//	
//	//TC26
//	
//	@When("The user clicks Max Consecutive Ones link")
//	public void the_user_clicks_max_consecutive_ones_link() {
//	   ap.clickMaxConsecutiveOnes();
//	}
//	//TC27 , TC28 --> ran through existing methods and step defs 
//	
//	//TC29
//	@When("The user clicks Find Numbers with Even Number of Digits link")
//	public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {
//	 ap.clickFindNumWithEvenNumOfDigits();
//	}
////TC30 and TC31 ==> ran through existing methods and step def 
//	
//	//TC32
//	
//	@When("The user clicks Squares of a Sorted Array link")
//	public void the_user_clicks_squares_of_a_sorted_array_link() {
//	  ap.clickSquaresOfASortedArray();
//	}
//}
//}
//
//
//
//
//
//
//
//
