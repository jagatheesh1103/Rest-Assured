package com.new_config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;

public class new_config {
	
	public static RestAssured re;
	
	public String base_uri_setup() throws IOException {
		
		FileInputStream fil = new FileInputStream("src/test/resources/Properties/Endpoints.properties");
		Properties pro = new Properties();
		pro.load(fil);
		
		String property = pro.getProperty("RAHULSHETTYBaseURI");
		
		
		
		return property;
		
		

	}

}
