package com.stepDef;

import com.base.BaseClass;
import com.pojo.objectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass {
	objectManager object = new objectManager();

	@When("User enter the {string}and {string}")
	public void user_enter_the_and(String accountNumber, String password) {
		takeScreenshot("LoginPage_Before");
		sendKeys(object.getLoginPagePojo().getTxtAccountNo(), accountNumber);
		sendKeys(object.getLoginPagePojo().getTxtPassword(), password);
	}

	@When("Click the Login button")
	public void click_the_Login_button() {
		takeScreenshot("LoginPage_After");
		btnClick(object.getLoginPagePojo().getBtnLogin());

	}

	@When("User enter the valid {string} and click on validate button")
	public void user_enter_the_valid_and_click_on_validate_button(String pin) {
		takeScreenshot("PinPage_Before");
		sendKeys(object.getLoginPagePojo().getTxtPin(), pin);
		takeScreenshot("PinPage_After");
		btnClick(object.getLoginPagePojo().getBtnValidate());
	}

	@Then("User should verify the login message with {string}")
	public void user_should_verify_the_login_message_with(String password) {
		if (password.equals("MavDemo@02")) {
			String text = getText(object.getLoginPagePojo().getErrorMessage());
			String message = "Not valid account number or password or Account is not Active. Please try again or contact to support.";
			assertEquals(text, message);
			takeScreenshot("LoginErrorPage");
		} else {
			System.out.println("Successfully Logged-In");
			getText(object.getLoginPagePojo().getPinMessage());
			takeScreenshot("SuccessfullLogin");
		}
	}
}
