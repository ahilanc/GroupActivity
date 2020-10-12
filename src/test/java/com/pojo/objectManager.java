package com.pojo;

import com.base.BaseClass;

public class objectManager extends BaseClass {
	private LoginPagePojo LoginPagePojo;
	private HomePagePojo HomePagePojo;
	private FundTransferPojo FundTransferPojo;
	private AccountDetailsPojo AccountDetailsPojo;

	public LoginPagePojo getLoginPagePojo() {
		return (LoginPagePojo == null) ? LoginPagePojo = new LoginPagePojo() : LoginPagePojo;
	}

	public HomePagePojo getHomePagePojo() {
		return (HomePagePojo == null) ? HomePagePojo = new HomePagePojo() : HomePagePojo;
	}

	public FundTransferPojo getFundTransferPojo() {
		return (FundTransferPojo == null) ? FundTransferPojo = new FundTransferPojo() : FundTransferPojo;
	}

	public AccountDetailsPojo getAccountDetailsPojo() {
		return (AccountDetailsPojo == null) ? AccountDetailsPojo = new AccountDetailsPojo() : AccountDetailsPojo;
	}

}
