package com.stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("I had done my Login");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user provides the correct credentials")
	public void user_provides_the_correct_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
	}

	@Then("user rendered to TestMeApp home page")
	public void user_rendered_to_TestMeApp_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
	}

}
