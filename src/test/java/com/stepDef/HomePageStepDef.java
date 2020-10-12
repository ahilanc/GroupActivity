package com.stepDef;

import com.base.BaseClass;
import com.pojo.objectManager;

import io.cucumber.java.en.Then;


public class HomePageStepDef extends BaseClass {
	objectManager object = new objectManager();

	@Then("User should navigate to Home Page successfully")
	public void user_should_navigate_to_Home_Page_successfully() {
		String text = getText(object.getHomePagePojo().getName());
		String name = "Welcome, TOUSIF KHAN";
		assertEquals(text, name);
		takeScreenshot("HomePage");
	}

	@Then("User clicks the FundTransfers option")
	public void user_clicks_the_FundTransfers_option() {
		btnClick(object.getHomePagePojo().getBtnFundTransfer());
	}

	@Then("User checks Amount and transactionNo after transaction in account summary")
	public void user_checks_Amount_and_transactionNo_after_transaction_in_account_summary() {
		btnClick(object.getHomePagePojo().getBtnAccountSummary());
		getText(object.getHomePagePojo().getBalance());
		getText(object.getHomePagePojo().getTransactionNo());
		takeScreenshot("AccountSummary");
	}

	@Then("User click the account details button")
	public void user_click_the_account_details_button() {
		btnClick(object.getHomePagePojo().getBtnAccountDetails());
	}
}
