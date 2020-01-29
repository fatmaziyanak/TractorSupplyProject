package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddEmployeeSteps extends CommonMethods{
	
	
	AddEmployeePageElements addEmp;
	String empId;
	
	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
		LoginPageElements login=new LoginPageElements();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
		DashboardPageElements dashboard=new DashboardPageElements();
		dashboard.navigateToAddEmployee();
	}

	@When("I add firstName, middleName and last name")
	public void i_add_firstName_middleName_and_last_name() {
		addEmp=new AddEmployeePageElements();
		sendText(addEmp.firstName, "John");
		sendText(addEmp.middleName, "J");
		sendText(addEmp.lastName, "Smith");
		empId=addEmp.empId.getText();
	}

	@When("I click Save")
	public void i_click_Save() {
		click(addEmp.saveBtn);
	}

	@Then("I see Employee has been succesfully added")
	public void i_see_Employee_has_been_succesfully_added() {
		PersonalDetailsPageElements pdetails=new PersonalDetailsPageElements();
		Assert.assertEquals("Employee is NOT being added", pdetails.empId.getText(), empId);
	}
}
