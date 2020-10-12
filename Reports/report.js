$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/DemoBank.feature");
formatter.feature({
  "name": "Validating the DemoBank site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate if user can navigate to home page with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enter the \"\u003caccountNumber\u003e\"and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User enter the valid \"\u003cPIN\u003e\" and click on validate button",
  "keyword": "When "
});
formatter.step({
  "name": "User should navigate to Home Page successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountNumber",
        "password",
        "PIN"
      ]
    },
    {
      "cells": [
        "1234556666",
        "MavDemo@01",
        "12345"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch demo bank application \"http://demo.rapidtestpro.com/login.php\" in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksClass.launch_demo_bank_application_in_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate if user can navigate to home page with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User enter the \"1234556666\"and \"MavDemo@01\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.user_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDef.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the valid \"12345\" and click on validate button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.user_enter_the_valid_and_click_on_validate_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to Home Page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.user_should_navigate_to_Home_Page_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});