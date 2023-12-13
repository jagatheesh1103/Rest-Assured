package com.helpers;

import com.new_config.new_config;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Helper extends new_config {
	
	
	public  void post_Rer(String postbody,String postre) {
		RequestSpecification body = re.given().contentType(ContentType.JSON).body(postbody);
		Response post = body.post(postre);
		String prettyPrint = post.prettyPrint();
		
		System.out.println(prettyPrint);

	}
	
	
	public void get_Res(String req) {
		
		String getst = re.get(req).getBody().asString();
		System.out.println(getst);
	}
	
	public void put_Req(String update,String putre) {
		RequestSpecification putb = re.given().contentType(ContentType.JSON).body(update);
		String putst = putb.put(putre).prettyPrint();
		//String putst = putresponse.prettyPrint();
		System.out.println(putst);

	}
	
	public void delete_Req(String del,String delre) {
		RequestSpecification delete = re.given().contentType(ContentType.JSON).body(del);
		Response delete2 = delete.delete(delre);
		String prettyPrint34 = delete2.prettyPrint();
		System.out.println(delete2.statusCode());
		System.out.println(prettyPrint34);

	}
	
	
	
	
	
	

}
