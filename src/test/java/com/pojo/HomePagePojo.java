package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePagePojo extends BaseClass {

	public HomePagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Fund Transfers']")
	private WebElement btnFundTransfer;
	@FindBy(xpath = "//a[text()='Account Statement']")
	private WebElement btnAccountStatement;
	@FindBy(xpath = "//a[text()='Account Details']")
	private WebElement btnAccountDetails;
	@FindBy(xpath = "//strong[contains(text(),'Available')]")
	private WebElement balance;
	@FindBy(xpath = "//strong[contains(text(),'Welcome')]")
	private WebElement name;
	@FindBy(xpath = "//a[text()='Account Summary']")
	private WebElement btnAccountSummary;
	@FindBy(xpath = "(//div[contains(text(),'TX')])[1]")
	private WebElement transactionNo;

	public WebElement getTransactionNo() {
		return transactionNo;
	}

	public WebElement getBtnAccountSummary() {
		return btnAccountSummary;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getBtnFundTransfer() {
		return btnFundTransfer;
	}

	public WebElement getBtnAccountStatement() {
		return btnAccountStatement;
	}

	public WebElement getBtnAccountDetails() {
		return btnAccountDetails;
	}

	public WebElement getBalance() {
		return balance;
	}
}
