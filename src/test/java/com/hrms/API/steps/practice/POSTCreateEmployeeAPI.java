package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;

public class POSTCreateEmployeeAPI {

	private static RequestSpecification request;
	private Response response;

	@Given("user calls createEmployee API to verify that an employee was created")
	public void user_calls_createEmployee_API_to_verify_that_an_employee_was_created() {

		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthenticationSteps.Token);

		request.body(CommonMethods.readJson(APIConstants.CREATE_EMPLOYEE_JSON));

	}

	@When("User retrieves response for createEmployee API")
	public void user_retrieves_response_for_createEmployee_API() {

		request.when().post(APIConstants.CREATE_EMPLOYEE_URI);
	}

	@Then("status code is {int} for createEmployeeAPI")
	public void status_code_is_for_createEmployeeAPI(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("user validates employee was created")
	public void user_validates_employee_was_created() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}
