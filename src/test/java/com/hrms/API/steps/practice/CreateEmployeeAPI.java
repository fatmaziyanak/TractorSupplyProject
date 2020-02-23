package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class CreateEmployeeAPI {
	

	private static RequestSpecification request;
	private Response response;
	
	
	@Given("user calls createEmployee API")
	public void user_calls_createEmployee_API() {
	    // Write code here that turns the phrase above into concrete actions
		
		request = given().header("Content-Type","application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
		
		
		
	}

	@When("User retrieves response")
	public void user_retrieves_response() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("status code is {int}")
	public void status_code_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user validates employee is created")
	public void user_validates_employee_is_created() {
	    // Write code here that turns the phrase above into concrete actions
	}

}
