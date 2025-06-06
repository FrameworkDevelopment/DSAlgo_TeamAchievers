package StepDefinitions;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.testng.Assert;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import PageObjectModel.HomePom;
import PageObjectModel.IntroductionPagePom;
import PageObjectModel.RegisterPom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_RegisterPage {

	RegisterPom regPage = new RegisterPom();
	public IntroductionPagePom ip = new IntroductionPagePom();
	public HomePom hp = new HomePom();

	String actualErrorMsg;
	String expectedErrorMsg;
	String actualSuccessMsg;
	String expectedSuccessMsg;

	//TC01
	@Given("The user is on the new user registration page")
	public void the_user_is_on_the_new_user_registration_page() {
		regPage.openURL();
		regPage.clickGetStartedBtn();
		regPage.clickRegisterLink_getStartedPage();
	}

	@When("The user clicks Register button with all fields empty on registration form from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_with_all_fields_empty_on_registration_form_from_sheetname_and_row(
			String string, Integer int1)
					throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		regPage.fillRegistrationForm("register", 0);
		regPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The error Please fill out this field. appears below Username textbox")
	public void the_error_please_fill_out_this_field_appears_below_username_textbox() {
		String browserValidationmsg = regPage.switchToElementAndGetValidationMessage();
		String expectedErrorMsg = "Please fill out this field.";
		Assert.assertEquals(browserValidationmsg, expectedErrorMsg);
	}

	//TC02
	@When("The user clicks Register button after entering Username with other fields empty from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty_from_sheetname_and_row(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		regPage.fillRegistrationForm("register", 1);
		regPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The error message Please fill out this field. appears below Password textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_textbox() {
		String browserValidationmsg = regPage.switchToElementAndGetValidationMessage();
		String expectedErrorMsg = "Please fill out this field.";
		Assert.assertEquals(browserValidationmsg, expectedErrorMsg);

	}

	//TC03
	@When("The user clicks Register button after entering Username and Password leaving Password Confirmation field empty from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_username_and_password_leaving_password_confirmation_field_empty_from_sheetname_and_row(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		regPage.fillRegistrationForm("register", 2);
		regPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The error message Please fill out this field. appears below  Password Confirmation textbox")
	public void the_error_message_please_fill_out_this_field_appears_below_password_confirmation_textbox() {
		String browserValidationmsg = regPage.switchToElementAndGetValidationMessage();
		String expectedErrorMsg = "Please fill out this field.";
		Assert.assertEquals(browserValidationmsg, expectedErrorMsg);
	}

	//TC04
	@When("The user clicks Register button after entering a username with spacebar characters other than digits and symbols from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and_symbols_from_sheetname_and_row(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		regPage.fillRegistrationForm("register", 3);
		regPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The user should be able to see error msg after entering invalid data")
	public void the_user_should_be_able_to_see_error_msg_after_entering_invalid_data() {
		expectedErrorMsg = "Invalid Username Entered";
		actualErrorMsg = regPage.displayPasswordMismatchError();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}

	//TC05
	@When("The user clicks Register button after entering a password with only numeric data from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_a_password_with_only_numeric_data_from_sheetname_and_row(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		regPage.fillRegistrationForm("register", 4);
		regPage.clickRegisterBtn_RegisterPage();
	}
	@Then("The user should be able to see error msg after entering invalid data in password fields")
	public void the_user_should_be_able_to_see_error_msg_after_entering_invalid_data_in_password_fields() {
		expectedErrorMsg = "Invalid Password Entered";
		actualErrorMsg = regPage.displayPasswordMismatchError();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}

	//TC06
	@When("The user clicks Register button after entering a password with less than eight characters from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_a_password_with_less_than_eight_characters_from_sheetname_and_row(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		regPage.fillRegistrationForm("register", 5);
		regPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The user should be able to see error msg after entering less than eight characters")
	public void the_user_should_be_able_to_see_error_msg_after_entering_less_than_eight_characters() {
		expectedErrorMsg = "Password Entered is less than eight characters";
		actualErrorMsg = regPage.displayPasswordMismatchError();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}

	//TC07
	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields_from_sheetname_and_row(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		regPage.fillRegistrationForm("register", 6);
		regPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The user should able to see an pwd warning message password_mismatch:The two password fields didn’t match.")
	public void the_user_should_able_to_see_an_pwd_warning_message_password_mismatch_the_two_password_fields_didn_t_match() {
		expectedErrorMsg = "password_mismatch:The two password fields didn’t match.";
		actualErrorMsg = regPage.displayPasswordMismatchError();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}

	//TC08
	@When("The user clicks Register button after entering  with valid username password and password confirmation in related textboxes from sheetname {string} and row {int}")
	public void the_user_clicks_register_button_after_entering_with_valid_username_password_and_password_confirmation_in_related_textboxes_from_sheetname_and_row(String string, Integer int1) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		regPage.fillRegistrationForm("register", 7);
		regPage.clickRegisterBtn_RegisterPage();
	}

	@Then("The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in as username")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message_new_account_created_you_are_logged_in_as_username() {

		expectedSuccessMsg = "regPage.registerSuccessMsg";
		actualSuccessMsg = "New Account Created.You are logged in as Testing@2025";
		actualErrorMsg = regPage.displayPasswordMismatchError();
	}

	//TC09

	@When("The user clicks login link from Registration page")
	public void the_user_clicks_login_link_from_registration_page() {
		regPage.clickLoginLink();
	}

	@Then("The user should be landed on login page")
	public void the_user_should_be_landed_on_login_page() {
		Assert.assertEquals(ip.getPageTitle(), "Login");
	}
	//TC10
	@When("The user clicks Sign in link from Registration page")
	public void the_user_clicks_sign_in_link_from_registration_page() {
		regPage.clickSignInLink();
	}
	

}

	