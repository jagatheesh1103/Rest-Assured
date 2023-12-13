package com.endpoints;

public class Rahulsgetty_endpoints {
	
	
	public String shetty_post_requerst="{\r\n" + 
			"  \"location\": {\r\n" + 
			"    \"lat\": -38.383494,\r\n" + 
			"    \"lng\": 33.427362\r\n" + 
			"  },\r\n" + 
			"  \"accuracy\": 50,\r\n" + 
			"  \"name\": \"Frontline house\",\r\n" + 
			"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
			"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
			"  \"types\": [\r\n" + 
			"    \"shoe park\",\r\n" + 
			"    \"shop\"\r\n" + 
			"  ],\r\n" + 
			"  \"website\": \"http://google.com\",\r\n" + 
			"  \"language\": \"French-IN\"\r\n" + 
			"}\r\n" + 
			"";
	
	public String shetty_post_resource="/maps/api/place/add/json?key =qaclick123";
	
	public String shetty_get_resource="/maps/api/place/get/json?key=qaclick123&place_id=c16dc8f49dcc37790bf5ac84485acf58";
	
	public String shetty_put_requesst="{\r\n" + 
			"\"place_id\":\"c16dc8f49dcc37790bf5ac84485acf58\",\r\n" + 
			"\"address\":\"70 jaga, UK\",\r\n" + 
			"\"key\":\"qaclick123\"\r\n" + 
			"}\r\n" + 
			"";
	public String shetty_put_resource="/maps/api/place/update/json?key, place_id //(place_id  value comes from Add place response)";
	
	public String shetty_delete_request="{\r\n" + 
			"    \"place_id\":\"c16dc8f49dcc37790bf5ac84485acf58\"\r\n" + 
			"}\r\n" + 
			"";
	
	public String shetty_delete_resource="/maps/api/place/delete/json?key";
	
	
	

}
