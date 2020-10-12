package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FundTransferPojo extends BaseClass {

	public FundTransferPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "rbname")
	private WebElement txtReceiverBankName;
	@FindBy(name = "rname")
	private WebElement txtReceiverName;
	@FindBy(id = "accno")
	private WebElement txtReceiverAccountNo;
	@FindBy(name = "swift")
	private WebElement txtRoutingNo;
	@FindBy(id = "amt")
	private WebElement txtAmount;
	@FindBy(id = "toption")
	private WebElement btnTransferType;
	@FindBy(id = "dot")
	private WebElement txtDate;
	@FindBy(id = "desc")
	private WebElement txtDescription;
	@FindBy(id = "submitButton")
	private WebElement btnFundTransfer;
	@FindBy(id = "token")
	private WebElement txtAuthCode;
	@FindBy(id = "submitButton")
	private WebElement btnValidate;
	@FindBy(id = "saccno")
	private WebElement accountNo;
	@FindBy(xpath = "//strong[text()='International Transaction Successful']")
	private WebElement successMessage;
	@FindBy(xpath = "(//span[@class='textfieldRequiredMsg'])[2]")
	private WebElement errorMessage1;
	@FindBy(xpath = "(//span[@class='textfieldRequiredMsg'])[3]")
	private WebElement errorMessage2;
	@FindBy(xpath = "(//span[@class='textfieldRequiredMsg'])[4]")
	private WebElement errorMessage3;
	@FindBy(xpath = "//span[text()='Ammount is required.']")
	private WebElement errorMessage4;
	@FindBy(xpath = "//span[text()='Please select fund transfer option.']")
	private WebElement errorMessage5;
	@FindBy(xpath = "//span[text()='Date of Transfer is required.']")
	private WebElement errorMessage6;
	@FindBy(xpath = "//span[text()='Description is required.']")
	private WebElement errorMessage7;
	@FindBy(xpath = "//td[contains(text(),'TX')]")
	private WebElement transactionNo;

	public WebElement getTransactionNo() {
		return transactionNo;
	}

	public WebElement getErrorMessage1() {
		return errorMessage1;
	}

	public WebElement getErrorMessage2() {
		return errorMessage2;
	}

	public WebElement getErrorMessage3() {
		return errorMessage3;
	}

	public WebElement getErrorMessage4() {
		return errorMessage4;
	}

	public WebElement getErrorMessage5() {
		return errorMessage5;
	}

	public WebElement getErrorMessage6() {
		return errorMessage6;
	}

	public WebElement getErrorMessage7() {
		return errorMessage7;
	}

	public WebElement getSuccessMessage() {
		return successMessage;
	}

	public WebElement getAccountNo() {
		return accountNo;
	}

	public WebElement getTxtReceiverBankName() {
		return txtReceiverBankName;
	}

	public WebElement getTxtReceiverName() {
		return txtReceiverName;
	}

	public WebElement getTxtReceiverAccountNo() {
		return txtReceiverAccountNo;
	}

	public WebElement getTxtRoutingNo() {
		return txtRoutingNo;
	}

	public WebElement getTxtAmount() {
		return txtAmount;
	}

	public WebElement getBtnTransferType() {
		return btnTransferType;
	}

	public WebElement getTxtDate() {
		return txtDate;
	}

	public WebElement getTxtDescription() {
		return txtDescription;
	}

	public WebElement getBtnFundTransfer() {
		return btnFundTransfer;
	}

	public WebElement getTxtAuthCode() {
		return txtAuthCode;
	}

	public WebElement getBtnValidate() {
		return btnValidate;
	}

}
