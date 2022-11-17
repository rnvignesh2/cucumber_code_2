package com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.utils.BaseClass;

import cucumber.api.java.en.*;

public class Stepdefinition extends BaseClass{
	

	
	@Given("user should be in the login page with valid credentials")
	public void user_should_be_in_the_login_page_with_credentials() {
		
		Browser("chrome", "https://adactinhotelapp.com/index.php");
		
	  }
	
	@Given("user should be in the login page with invalidcredentials")
	public void user_should_be_in_the_login_page_with_invalidcredentials() {
		Browser("chrome", "https://adactinhotelapp.com/index.php");

	}

	@When("user is entering {string} and {string}")
	public void user_is_entering_and(String username, String password) {
	locator("name", "username").sendKeys(username);
	locator("name", "password").sendKeys(password);
	
	
	}

	@When("clicking login button")
	public void clicking_login_button() {
		locator("xpath", "//input[@type='Submit']").click();
	 }

	@Then("verifying the success message")
	public void verifying_the_success_message() {
		boolean displayed = locator("id", "username_show").isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("loginsuccess");
	  }

	@Then("verifying the error message")
	public void verifying_the_error_message() {
		boolean displayed = locator("xpath", "//div[@class='auth_error']").isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("login failed");
	    }

}
