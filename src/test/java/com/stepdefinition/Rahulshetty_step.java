package com.stepdefinition;

import com.endpoints.Rahulsgetty_endpoints;
import com.helpers.Helper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rahulshetty_step extends Helper{
	
	public Rahulsgetty_endpoints rsen;
	
	
	@When("To the post the rahulshetty request")
	public void to_the_post_the_rahulshetty_request() {
		rsen= new Rahulsgetty_endpoints();
		post_Rer(rsen.shetty_post_requerst, rsen.shetty_post_resource);
	    
	}

	@When("To the get response in rahulshetty")
	public void to_the_get_response_in_rahulshetty() {
		get_Res(rsen.shetty_get_resource);
	    
	}

	@Then("To the validate the response in rahulshetty")
	public void to_the_validate_the_response_in_rahulshetty() {
	    
	}

	@When("To the put the update in rahulshetty")
	public void to_the_put_the_update_in_rahulshetty() {
		put_Req(rsen.shetty_post_requerst, rsen.shetty_post_resource);
	   
	}

	@Then("To the validate the update data")
	public void to_the_validate_the_update_data() {
		 get_Res(rsen.shetty_get_resource);
	    
	}

	@When("To the delete the request in rahulshetty")
	public void to_the_delete_the_request_in_rahulshetty() {
		delete_Req(rsen.shetty_delete_request, rsen.shetty_delete_resource);
	   
	}

}
