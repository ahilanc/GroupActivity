package com.stepDef;

import com.base.BaseClass;
import com.pojo.objectManager;

import io.cucumber.java.en.Then;


public class FundTransferStepDef extends BaseClass {
	objectManager object = new objectManager();

	@Then("User enters the {string}, {string}, {string},{string}, {string}, {string} and {string}")
	public void user_enters_the_and(String ReceiverBankName, String ReceiverName, String ReceiverAccountNumber,
			String RoutingNumber, String Amount, String Date, String Description) {
		takeScreenshot("FundTransfer_Before");
		sendKeys(object.getFundTransferPojo().getTxtReceiverBankName(), ReceiverBankName);
		sendKeys(object.getFundTransferPojo().getTxtReceiverName(), ReceiverName);
		sendKeys(object.getFundTransferPojo().getTxtReceiverAccountNo(), ReceiverAccountNumber);
		sendKeys(object.getFundTransferPojo().getTxtRoutingNo(), RoutingNumber);
		sendKeys(object.getFundTransferPojo().getTxtAmount(), Amount);
		sendKeys(object.getFundTransferPojo().getTxtDate(), Date);
		sendKeys(object.getFundTransferPojo().getTxtDescription(), Description);
	}

	@Then("User checks success message and reference no")
	public void user_checks_success_message_and_reference_no() throws Exception {
		String text = getText(object.getFundTransferPojo().getSuccessMessage());
		String message = "International Transaction Successful";
		assertEquals(text, message);
		getText(object.getFundTransferPojo().getTransactionNo());
		takeScreenshot("ValidFundTransfer");
	}

	@Then("User selects the {string} and clicks the FundTransfers button")
	public void user_selects_the_and_clicks_the_FundTransfers_button(String type) {
		selectValue(object.getFundTransferPojo().getBtnTransferType(), type);
		takeScreenshot("FundTransferPage_After");
		btnClick(object.getFundTransferPojo().getBtnFundTransfer());
	}

	@Then("User enter the {string} and click validate button")
	public void user_enter_the_and_click_validate_button(String code) {
		takeScreenshot("AuthCodePage_Before");
		sendKeys(object.getFundTransferPojo().getTxtAuthCode(), code);
		takeScreenshot("AuthCodePage_After");
		btnClick(object.getFundTransferPojo().getBtnValidate());
	}

	@Then("User enters {string} and click FundTransfers button")
	public void user_enters_and_click_FundTransfers_button(String bank) {
		takeScreenshot("InvalidFundTransfer_Before");
		sendKeys(object.getFundTransferPojo().getTxtReceiverBankName(), bank);
		takeScreenshot("InvalidFundTransfer_After");
		btnClick(object.getFundTransferPojo().getBtnFundTransfer());
	}

	@Then("User see the warning message when mandatory field is missing")
	public void user_see_the_warning_message_when_mandatory_field_is_missing() {
		getText(object.getFundTransferPojo().getErrorMessage1());
		getText(object.getFundTransferPojo().getErrorMessage2());
		getText(object.getFundTransferPojo().getErrorMessage3());
		getText(object.getFundTransferPojo().getErrorMessage4());
		getText(object.getFundTransferPojo().getErrorMessage5());
		getText(object.getFundTransferPojo().getErrorMessage6());
		getText(object.getFundTransferPojo().getErrorMessage7());
		takeScreenshot("InvalidFundTransfer");
	}

}
