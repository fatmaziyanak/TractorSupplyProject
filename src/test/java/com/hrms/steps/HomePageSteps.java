package com.hrms.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.Action;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends CommonMethods {

	@Given("I click esc keyword to close landing page popups")
	public void I_click_esc_keyword_to_close_landing_page_popups() throws InterruptedException, AWTException {
		Thread.sleep(10000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ESCAPE);

	}

	@Then("I validated home page")
	public void I_validated_home_page() throws InterruptedException {

		Assert.assertTrue("Welcome Text displayed", home.welcomeText.isDisplayed());


	}


	@When("I click on search box")
	public void i_click_on_search_box() throws InterruptedException {

		Thread.sleep(2000);
		jsClick(home.searchBox);

	}

	@When("I type product on search box")
	public void I_type_product_on_search_box() throws InterruptedException, AWTException {
		sendText(home.searchBox, "Multi-Cat Adult Chicken and Fish Formula Dry Cat Food");
		Assert.assertTrue("Text displayed", home.searchBox.isDisplayed());

		Thread.sleep(5000);

		jsClick(home.searchBoxMagnifier);

		String str = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(str);


	}}
