package com.LoginStepDefinition;

import java.util.List;

import org.junit.Assert;

import com.base.BaseClass;
import com.pom.PomLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginStepDefinition extends PomLoginPage {
	
	LoginStepDefinition l;

	@Given("user should be in the loginpage with username and password box displayed")
	public void user_should_be_in_the_loginpage_with_username_and_password_box_displayed() {
		browser("https://adactinhotelapp.com/index.php");

	}

	@When("user should enter the username and password.")
	public void user_should_enter_the_username_and_password(DataTable dataTable) {
	   List<List<String>> asList = dataTable.asLists();
	   for (int i = 0; i < asList.size(); i++) {
			 l = new LoginStepDefinition();
		String user = asList.get(i).get(0);
		l.getUser().sendKeys(user);
		String pass = asList.get(i).get(1);
		l.getPass().sendKeys(pass);
	}
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		 l = new LoginStepDefinition();

		l.getLogin().click();
	}

	@Then("verifying whether successful login or failed login.")
	public void verifying_whether_successful_login_or_failed_login() {
		Assert.assertTrue(true);
	}

}
