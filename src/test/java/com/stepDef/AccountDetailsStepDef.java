package com.stepDef;

import com.base.BaseClass;
import com.pojo.objectManager;

import io.cucumber.java.en.Then;



public class AccountDetailsStepDef extends BaseClass {
	objectManager object = new objectManager();

	@Then("User should able to see all the account details")
	public void user_should_able_to_see_all_the_account_details() {
		getText(object.getAccountDetailsPojo().getTxtuserName());
		getText(object.getAccountDetailsPojo().getTextAccountDetails());
		takeScreenshot("AccountDetails");
	}

}
