package com.DataTableStepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.utils.BaseClass;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;



public class DataTableStepDefinition extends BaseClass{

	@Given("user should be in the login page with credentials")
	public void user_should_be_in_the_login_page_with_credentials() {
	 Browser("chrome", "https://adactinhotelapp.com/index.php");
	}

	@When("user is entering username and password")
	public void user_is_entering_username_and_password(DataTable dataTable) {
	 List<Map<String, String>> asMaps = dataTable.asMaps();
	 for(Map<String, String> data: asMaps) {
		 String string = data.get("username");
		 System.out.println(string);
		 String string1 = data.get("password");
		 System.out.println(string);
		 locator("id", "username").sendKeys(string);
			locator("id", "password").sendKeys(string1);
	 }
	
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



}
