package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AccountDetailsPojo extends BaseClass {

	public AccountDetailsPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//th[text()='User Account Details']")
	private WebElement textAccountDetails;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement txtuserName;

	public WebElement getTextAccountDetails() {
		return textAccountDetails;
	}

	public WebElement getTxtuserName() {
		return txtuserName;
	}

}
