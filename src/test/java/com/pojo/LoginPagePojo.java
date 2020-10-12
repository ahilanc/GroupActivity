package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPagePojo extends BaseClass {

	public LoginPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "accno")
	private WebElement txtAccountNo;
	@FindBy(id = "pass")
	private WebElement txtPassword;
	@FindBy(id = "submitButton")
	private WebElement btnLogin;
	@FindBy(id = "accpin")
	private WebElement txtPin;
	@FindBy(id = "submitButton")
	private WebElement btnValidate;
	@FindBy(xpath = "//div[contains(text(),'Not valid')]")
	private WebElement errorMessage;
	@FindBy(xpath = "//p[contains(text(),'Enter')]")
	private WebElement pinMessage;

	public WebElement getPinMessage() {
		return pinMessage;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getTxtAccountNo() {
		return txtAccountNo;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtPin() {
		return txtPin;
	}

	public WebElement getBtnValidate() {
		return btnValidate;
	}
}
