package com.stepDef;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;



public class HooksClass extends BaseClass {
	@Before
	public void beforeExecution(Scenario scenario) {
		System.out.println("Scenario Started Successfully....");
	}

	@Given("Launch demo bank application {string} in browser")
	public void launch_demo_bank_application_in_browser(String url) {
		launchBrowser();
		loadUrl(url);
		driver.manage().deleteAllCookies();
	}

	@After
	public void afterExecution() {
		closeBrowser();
		System.out.println("Scenario Completed and Brwser closed....");
	}
}
