package StepDefinitions;

import java.util.concurrent.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import AppHooks.Hooks;
import DriverManager.Driver_SetUp;
import PageObjectModel.DataStructureIntroPom;
import PageObjectModel.HomePom;
import PageObjectModel.IntroductionPagePom;
import PageObjectModel.LinkedListPom;
import PageObjectModel.TryEditorDsPom;
import Utilities.LoggerLoad;
import io.cucumber.java.en.*;

public class Step_LinkedListPage {

	public HomePom hp = new HomePom();
	public IntroductionPagePom ip = new IntroductionPagePom();
	public DataStructureIntroPom dsIntro = new DataStructureIntroPom();
	public LinkedListPom ls = new LinkedListPom();
	public TryEditorDsPom tp = new TryEditorDsPom();
	

	public WebDriver driver = Driver_SetUp.getDriver();

	//Background Step 
	@When("The user clicks the Get Started button of Linked List section")
	public void the_user_clicks_the_get_started_button_of_linked_list_section() {
		ls.clicklsGetStartedBtn();
		LoggerLoad.info("Linked List Get Started Button clicked");
		}

	//TC01
	@Then("The user should be directed to Linked List page")
	public void the_user_should_be_directed_to_linked_list_page() throws InterruptedException {
		Assert.assertEquals("Linked List", dsIntro.validatePageTitle());
		Thread.sleep(10);
		LoggerLoad.info("Linked List Page displayed");
	}

	// TC02
	@When("The user clicks the Introduction link")
	public void the_user_clicks_the_introduction_link() {
		ls.clicklsIntroductionLink();
		LoggerLoad.info("Introduction Link clicked");
	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() {
		Assert.assertEquals("Introduction", dsIntro.validatePageTitle());
		LoggerLoad.info("Introduction page displayed");
	}
   //TC03
	@When("The user clicks Try Here button in Introduction page")
	public void the_user_clicks_try_here_button_in_introduction_page() {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsIntroductionLink();
		LoggerLoad.info("Introduction link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button() throws InterruptedException {
		Assert.assertTrue(ip.validateElementDisplayed(tp.runButton));
		LoggerLoad.info("Run Button displayed");
		
		
	}
	// TC04
	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsIntroductionLink();
		LoggerLoad.info("Introduction link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
		tp.clickRunButton();
		LoggerLoad.info("Run Button clicked");
	}

	@Then("The user should not see any error message as an alert")
	public void the_user_should_not_see_any_error_message_as_an_alert() throws TimeoutException {
		Assert.assertEquals(false, tp.isAlertPresent());
		LoggerLoad.info("No Alert  or error displayed");
	}
	
	//TC05
	@When("The user clicks Run button with invalid code from sheetname {string} and row {int} for Introduction page")
	public void the_user_clicks_run_button_with_invalid_code_from_sheetname_and_row_for_introduction_page(String string, Integer int1) {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsIntroductionLink();
		LoggerLoad.info("Introduction link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
		

		try {

			tp.enterTryHereCode("tryEditorCode", 1);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
	}
	//TC06
	@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Introduction page")
	public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_introduction_page(String string, Integer int1) {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsIntroductionLink();
		LoggerLoad.info("Introduction link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
		

		try {

			tp.enterTryHereCode("tryEditorCode", 0);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
	}
	
	//TC07
	@When("The user clicks the Creating Linked LIst link")
	public void the_user_clicks_the_creating_linked_l_ist_link() throws InterruptedException {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsCreatingLinkedLIstLink();
		LoggerLoad.info("Creating Linked List Link Clicked");
		
	}

	@Then("The user should be redirected to  Creating Linked LIst link page")
	public void the_user_should_be_redirected_to_creating_linked_l_ist_link_page() {

		Assert.assertEquals("Creating Linked LIst", dsIntro.validatePageTitle());
		LoggerLoad.info("Creating Linked List page opened");
	}

	//TC08
	@When("The user clicks Try Here button in Creating Linked LIst page")
	public void the_user_clicks_try_here_button_in_creating_linked_l_ist_page() {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsCreatingLinkedLIstLink();
		LoggerLoad.info("Creating Linked List Link Clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("Try Here Button clicked");

	}
	//TC09
	@When("The user clicks the Run button without entering the code in the Editor for Creating Linked LIst page")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_creating_linked_l_ist_page() {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsCreatingLinkedLIstLink();
		LoggerLoad.info("Creating Linked List Link Clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("Try Here Button clicked");
		tp.clickRunButton();
		LoggerLoad.info("Run Button clicked");
	}
	//TC10
	@When("The user clicks Run button with invalid code from sheetname {string} and row {int} for Creating Linked LIst page")
	public void the_user_clicks_run_button_with_invalid_code_from_sheetname_and_row_for_creating_linked_l_ist_page(String string, Integer int1) {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsCreatingLinkedLIstLink();
		LoggerLoad.info("Creating Linked List Link Clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
		

		try {

			tp.enterTryHereCode("tryEditorCode", 1);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
	}
	
	//TC11
	@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Creating Linked LIst page")
	public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_creating_linked_l_ist_page(String string, Integer int1) {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsCreatingLinkedLIstLink();
		LoggerLoad.info("Creating Linked List Link Clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
		

		try {

			tp.enterTryHereCode("tryEditorCode", 0);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
	}


	 // TC12
	 @When("The user clicks the Types of Linked List page link")
	 public void the_user_clicks_the_types_of_linked_list_page_link() {
		ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsTypesOfLinkedListLink();
		LoggerLoad.info("Types of Linked List page link clicked");
	}

	@Then("The user should be redirected to Types of Linked List page")
	public void the_user_should_be_redirected_to_types_of_linked_list_page() {
		Assert.assertEquals("Types of Linked List", dsIntro.validatePageTitle());
		LoggerLoad.info("Types of Linked List page displayed");
	}
	// TC13
    @When("The user clicks Try Here button in Types of Linked List page")
    public void the_user_clicks_try_here_button_in_types_of_linked_list_page() {
	 ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsTypesOfLinkedListLink();
		LoggerLoad.info("Types of Linked List page link clicked");
        tp.clickTryHereBtn();
        LoggerLoad.info("Try Here Button clicked");
}
    //TC14
    @When("The user clicks the Run button without entering the code in the Editor for Types of Linked List page")
    public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_types_of_linked_list_page() {
	    ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsTypesOfLinkedListLink();
		LoggerLoad.info("Types of Linked List page link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("Try Here Button clicked");
		tp.clickRunButton();
		LoggerLoad.info("Run Button clicked");
 }
 
    //TC15
    @When("The user clicks Run button with invalid code from sheetname {string} and row {int} for Types of Linked List page")
 public void the_user_clicks_run_button_with_invalid_code_from_sheetname_and_row_for_types_of_linked_list_page(String string, Integer int1) {
    	ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsTypesOfLinkedListLink();
		LoggerLoad.info("Types of Linked List page link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
		

		try {

			tp.enterTryHereCode("tryEditorCode", 1);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
 }
 
 //TC16
 @When("The user clicks Run button with valid code from sheetname {string} and row {int} for Types of Linked List page")
 public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_types_of_linked_list_page(String string, Integer int1) {
	    ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsTypesOfLinkedListLink();
		LoggerLoad.info("Types of Linked List page link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
		

		try {

			tp.enterTryHereCode("tryEditorCode", 0);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
 }
 
 
//TC17
@When("The user clicks the Implement Linked List in Python page link")
public void the_user_clicks_the_implement_linked_list_in_python_page_link() {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
    ls.clicklsImplementLinkedListInPythonLink();
    LoggerLoad.info("Implement Linked List in Python link clicked");
}

@Then("The user should be redirected to Implement Linked List in Python page")
public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() {
	Assert.assertEquals("Implement Linked List in Python", dsIntro.validatePageTitle());
	LoggerLoad.info("Implement Linked List in Python page displayed");
}

//TC18
@When("The user clicks Try Here button in Implement Linked List in Python page")
public void the_user_clicks_try_here_button_in_implement_linked_list_in_python_page() {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
    ls.clicklsImplementLinkedListInPythonLink();
    LoggerLoad.info("Implement Linked List in Python link clicked");
	tp.clickTryHereBtn();
	 LoggerLoad.info("Try Here Button clicked");
}
//TC19
@When("The user clicks the Run button without entering the code in the Editor for Implement Linked List in Python page")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_implement_linked_list_in_python_page() {
	    ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsImplementLinkedListInPythonLink();
		LoggerLoad.info("Implement Linked List in Python link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("Try Here Button clicked");
		tp.clickRunButton();
		LoggerLoad.info("Run Button clicked");
}
//TC20

@When("The user clicks Run button with invalid code from sheetname {string} and row {int} for Implement Linked List in Python page")
public void the_user_clicks_run_button_with_invalid_code_from_sheetname_and_row_for_implement_linked_list_in_python_page(String string, Integer int1) {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsImplementLinkedListInPythonLink();
	LoggerLoad.info("Implement Linked List in Python link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("TryHere Button clicked");
	

	try {

		tp.enterTryHereCode("tryEditorCode", 1);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}

//TC21
@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Implement Linked List in Python page")
public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_implement_linked_list_in_python_page(String string, Integer int1) {
	    ip.clickDropdownToggle();
		LoggerLoad.info("Dropdown Toggle clicked");
		ip.clickDropdownItemLinkedList();
		LoggerLoad.info("Linked List Drop item selected");
		ls.clicklsImplementLinkedListInPythonLink();
		LoggerLoad.info("Implement Linked List in Python link clicked");
		tp.clickTryHereBtn();
		LoggerLoad.info("TryHere Button clicked");
		

		try {

			tp.enterTryHereCode("tryEditorCode", 0);
			tp.clickRunButton();
		} catch (Exception e) {
			System.err.println("Error while entering code or clicking Run: " + e.getMessage());
		}
}

//TC22
@When("The user clicks the Traversal page link")
public void the_user_clicks_the_traversal_page_link() {
   ls.clicklsTraversalLink();
   LoggerLoad.info("Traversal link clicked");
}

@Then("The user should be redirected to Traversal page")
public void the_user_should_be_redirected_to_traversal_page() {
	Assert.assertEquals("Traversal", dsIntro.validatePageTitle());
	LoggerLoad.info("Traversal page displayed");
}
//TC23
@When("The user clicks Try Here button in Traversal page")
public void the_user_clicks_try_here_button_in_traversal_page() {
	
	ls.clicklsTraversalLink();
	LoggerLoad.info("Traversal link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here button clicked");
}

//TC24
@When("The user clicks the Run button without entering the code in the Editor for Traversal page")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_traversal_page() {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsTraversalLink();
	LoggerLoad.info("Traversal link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button clicked");
	tp.clickRunButton();
	LoggerLoad.info("Run Button clicked");
}

//TC25
@When("The user clicks Run button with invalid code from sheetname {string} and row {int} for Traversal page")
public void the_user_clicks_run_button_with_invalid_code_from_sheetname_and_row_for_traversal_page(String string, Integer int1) {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsTraversalLink();
	LoggerLoad.info("Traversal link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("TryHere Button clicked");
	

	try {

		tp.enterTryHereCode("tryEditorCode", 1);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}
//TC26
@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Traversal page")
public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_traversal_page(String string, Integer int1) {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsTraversalLink();
	LoggerLoad.info("Traversal link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("TryHere Button clicked");
	

	try {

		tp.enterTryHereCode("tryEditorCode", 0);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}

//TC24, TC25, TC26 --> this is called from already working code from DS page
//(Step_DataStructurePage.java file)

//TC27
@When("The user clicks the Insertion page link")
public void the_user_clicks_the_insertion_page_link() {
    ls.clicklsInsertionLink();
    LoggerLoad.info("Insertion Link clicked");
}

@Then("The user should be redirected to Insertion page")
public void the_user_should_be_redirected_to_insertion_page() {
	Assert.assertEquals("Insertion", dsIntro.validatePageTitle());  
	LoggerLoad.info("Insertion page displayed");
}

//TC28
@When("The user clicks Try Here button in insertion page")
public void the_user_clicks_try_here_button_in_insertion_page() {
	ls.clicklsInsertionLink();
	LoggerLoad.info("Insertion link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here button clicked");
	}

//TC29
@When("The user clicks the Run button without entering the code in the Editor for Insertion page")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_insertion_page() {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsInsertionLink();
	LoggerLoad.info("Insertion link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button clicked");
	tp.clickRunButton();
	LoggerLoad.info("Run Button clicked");
}
//TC30

@When("The user clicks Run button with invalid code from sheetname {string} and row {int} for Insertion page")
public void the_user_clicks_run_button_with_invalid_code_from_sheetname_and_row_for_insertion_page(String string, Integer int1) {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsTraversalLink();
	LoggerLoad.info("Insertion link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("TryHere Button clicked");
	

	try {

		tp.enterTryHereCode("tryEditorCode", 1);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}
//TC31
@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Insertion page")
public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_insertion_page(String string, Integer int1) {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsTraversalLink();
	LoggerLoad.info("Insertion link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("TryHere Button clicked");
	

	try {

		tp.enterTryHereCode("tryEditorCode", 0);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}

//TC32

@When("The user clicks the Deletion page link")
public void the_user_clicks_the_deletion_page_link() {
   ls.clicklsDeletionLink();
   LoggerLoad.info("Deletion Link clicked");
}

@Then("The user should be redirected to Deletion page")
public void the_user_should_be_redirected_to_deletion_page() {
	Assert.assertEquals("Deletion", dsIntro.validatePageTitle());
	 LoggerLoad.info("Deletion page displayed");
}

//TC33

@When("The user clicks Try Here button in Deletion page")
public void the_user_clicks_try_here_button_in_deletion_page() {
	
	ls.clicklsDeletionLink();
	LoggerLoad.info("Deletion link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here button clicked");
    
}

//TC34
@When("The user clicks the Run button without entering the code in the Editor for Deletion page")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_deletion_page() {
    ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsDeletionLink();
	LoggerLoad.info("Deletion link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("Try Here Button clicked");
	tp.clickRunButton();
	LoggerLoad.info("Run Button clicked");
}
//TC35

@When("The user clicks Run button with invalid code from sheetname {string} and row {int} for Deletion page")
public void the_user_clicks_run_button_with_invalid_code_from_sheetname_and_row_for_deletion_page(String string, Integer int1) {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsDeletionLink();
	LoggerLoad.info("Deletion link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("TryHere Button clicked");
	

	try {

		tp.enterTryHereCode("tryEditorCode", 1);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}

//TC36
@When("The user clicks Run button with valid code from sheetname {string} and row {int} for Deletion page")
public void the_user_clicks_run_button_with_valid_code_from_sheetname_and_row_for_deletion_page(String string, Integer int1) {
	ip.clickDropdownToggle();
	LoggerLoad.info("Dropdown Toggle clicked");
	ip.clickDropdownItemLinkedList();
	LoggerLoad.info("Linked List Drop item selected");
	ls.clicklsDeletionLink();
	LoggerLoad.info("Deletion link clicked");
	tp.clickTryHereBtn();
	LoggerLoad.info("TryHere Button clicked");
	

	try {

		tp.enterTryHereCode("tryEditorCode", 0);
		tp.clickRunButton();
	} catch (Exception e) {
		System.err.println("Error while entering code or clicking Run: " + e.getMessage());
	}
}
// (Practice Questions page validations) 

//TC37
@When("The user clicks Practice Questions link from Introduction Page")
public void the_user_clicks_practice_questions_link_from_introduction_page() {
	ls.clicklsIntroductionLink();
	LoggerLoad.info("Introduction Link clicked");
	ls.clickpracticequestions();
	LoggerLoad.info("Practice Questions Link Clicked");
}

@Then("The user should see list of Practice Questions")
public void the_user_should_see_list_of_practice_questions() {
	Assert.assertEquals("Assessment", dsIntro.validatePageTitle());		
	LoggerLoad.info("dsIntro.validatePageTitle()->" + dsIntro.validatePageTitle());
}

//TC38
@When("The user clicks Practice Questions link from Creating Linked List Page")
public void the_user_clicks_practice_questions_link_from_creating_linked_list_page() {
	ls.clicklsCreatingLinkedLIstLink();
	LoggerLoad.info("Creating Linked List link clicked");
	ls.clickpracticequestions();
	LoggerLoad.info("Practice Questions Link Clicked");
}

//TC39
@When("The user clicks Practice Questions link from Types of Linked List Page")
public void the_user_clicks_practice_questions_link_from_types_of_linked_list_page() {
	ls.clicklsTypesOfLinkedListLink();
	LoggerLoad.info("Types of Linked List");
	ls.clickpracticequestions();
	LoggerLoad.info("Practice Questions Link Clicked");
}

//TC40
@When("The user clicks Practice Questions link from Implement Linked List in Python Page")
public void the_user_clicks_practice_questions_link_from_implement_linked_list_in_python_page() {
	ls.clicklsImplementLinkedListInPythonLink();
	LoggerLoad.info("Implement Linked List in Python link clicked");
	ls.clickpracticequestions();
	LoggerLoad.info("Practice Questions Link Clicked");
}

//TC41
@When("The user clicks Practice Questions link from Traversal Page")
public void the_user_clicks_practice_questions_link_from_traversal_page() {
	ls.clicklsTraversalLink();
	LoggerLoad.info("Traversal Link clicked");
	ls.clickpracticequestions();
	LoggerLoad.info("Practice Questions Link Clicked");
}

//TC42
@When("The user clicks Practice Questions link from Insertion Page")
public void the_user_clicks_practice_questions_link_from_insertion_page() {
	ls.clicklsInsertionLink();
	LoggerLoad.info("Insertion Link clicked");
	ls.clickpracticequestions();
	LoggerLoad.info("Practice Questions Link Clicked");
}

//TC43
@When("The user clicks Practice Questions link from Deletion Page")
public void the_user_clicks_practice_questions_link_from_deletion_page() {
	ls.clicklsDeletionLink();
	LoggerLoad.info("Deletion Link clicked");
	ls.clickpracticequestions();
	LoggerLoad.info("Practice Questions Link Clicked");
}


@Then("The user should be redirected to try Editor page with a Run button")
public void the_user_should_be_redirected_to_try_editor_page_with_a_run_button() {
	Assert.assertEquals(dsIntro.validatePageTitle(), "Assessment");
}
}