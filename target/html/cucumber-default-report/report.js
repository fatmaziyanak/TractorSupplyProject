$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
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
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "ReportPageSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I add \"John\", \"S\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Employee has been succesfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_has_been_succesfully_added()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Valid  login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_usename_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I succesfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_succesfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Report.feature");
formatter.feature({
  "name": "Report",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint3"
    },
    {
      "name": "@addreport"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search for invalid report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter invalid \"\u003creportName\u003e\" report",
  "keyword": "When "
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.step({
  "name": "I see \"No Records Found\" message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "reportName"
      ]
    },
    {
      "cells": [
        "Regression"
      ]
    },
    {
      "cells": [
        "Smoke"
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
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "ReportPageSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportPageSteps.i_navigated_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for invalid report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint3"
    },
    {
      "name": "@addreport"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter invalid \"Regression\" report",
  "keyword": "When "
});
formatter.match({
  "location": "ReportPageSteps.i_enter_invalid_report(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportPageSteps.i_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see \"No Records Found\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "ReportPageSteps.i_see_message(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.hrms.steps.ReportPageSteps.i_see_message(ReportPageSteps.java:47)\r\n\tat ✽.I see \"No Records Found\" message(file:src/test/resources/features/Report.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
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
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "ReportPageSteps.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to the Reports Page",
  "keyword": "And "
});
formatter.match({
  "location": "ReportPageSteps.i_navigated_to_the_Reports_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for invalid report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint3"
    },
    {
      "name": "@addreport"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter invalid \"Smoke\" report",
  "keyword": "When "
});
formatter.match({
  "location": "ReportPageSteps.i_enter_invalid_report(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search button",
  "keyword": "And "
});
formatter.match({
  "location": "ReportPageSteps.i_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see \"No Records Found\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "ReportPageSteps.i_see_message(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.hrms.steps.ReportPageSteps.i_see_message(ReportPageSteps.java:47)\r\n\tat ✽.I see \"No Records Found\" message(file:src/test/resources/features/Report.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});