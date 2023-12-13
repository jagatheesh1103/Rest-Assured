package com.stepdefinition;

import java.io.IOException;

import com.endpoints.Endpoints;
import com.helpers.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Step extends Helper {
	public Endpoints ep;
	public Response response;
	
	@Given("To setup the BaseURI")
	public void to_setup_the_base_uri() throws IOException {
		re.baseURI=base_uri_setup();
	   
	}

	@When("To post the C2TA request")
	public void to_post_the_c2ta_request() {
		ep = new Endpoints();
		post_Rer(ep.C2TA_Post_body, ep.C2TA_Post_resource);

	}

	@When("To get the response in C2TA")
	public void to_get_the_response_in_c2ta() {
		//response = re.get(ep.C2TA_get_resource);
		get_Res(ep.C2TA_get_resource);
	   
	}

	@Then("To validate the response")
	public void to_validate_the_response() {
	//	String topr = response.prettyPrint();
	//	System.out.println(topr);
		
	    
	}

	@When("To put the C2TA request")
	public void to_put_the_c2ta_request() {
		put_Req(ep.C2TA_put_body, ep.C2TA_put_resource);
	    
	}

	@Then("To validate the update data")
	public void to_validate_the_update_data() {
		get_Res(ep.C2TA_update_get);
	   
	}

	@When("To dalete the data")
	public void to_dalete_the_data() {
		delete_Req(ep.C2TA_delete_body, ep.C2TA_delete_resource);
	   
	}



}
