package com.stepdefinition;

import com.endpoints.Reqres_endpoints;
import com.helpers.Helper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Reqres_step extends Helper {
	public Reqres_endpoints rendp;
	
	@When("To the post REQRES request")
	public void to_the_post_reqres_request() {
		rendp = new Reqres_endpoints();
		post_Rer(rendp.reqres_post_request, rendp.reqres_post_resource);
	    
	}

	@When("To the get the response in REQRES")
	public void to_the_get_the_response_in_reqres() {
		get_Res(rendp.reqres_get_resource);
	    
	}

	@Then("To validate the response in REQRES")
	public void to_validate_the_response_in_reqres() {
	   
	}

	@When("To put the REQRES request")
	public void to_put_the_reqres_request() {
		put_Req(rendp.reqres_put_request, rendp.reqres_put_resource);
	   
	}

	@Then("To validate the update data in REQRES")
	public void to_validate_the_update_data_in_reqres() {
	   
	}

	@When("To dalete the data in REQRES")
	public void to_dalete_the_data_in_reqres() {
		delete_Req(rendp.reqres_delete_request, rendp.reqres_delete_resource);
	    
	}


}
