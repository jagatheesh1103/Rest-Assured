package com.endpoints;

public class Endpoints {
	
	public String C2TA_Post_body="{\r\n" + 
			"\"title\": \"Project Manager\" ,\r\n" + 
			"\"body\": \"selenium\",\r\n" + 
			"\"author\": \"joshi\"\r\n" + 
			"}\r\n" + 
			"";
	
	public String C2TA_put_body="{\r\n" + 
			"        \"id\": \"1301\",\r\n" + 
			"        \"title\": \"main\",\r\n" + 
			"        \"body\": \"jagatheesh\",\r\n" + 
			"        \"author\": \"new member\"\r\n" + 
			"    }\r\n" + 
			"";
	
	public String C2TA_delete_body="{\r\n" + 
			"\"id\" : \"1301\"\r\n" + 
			"}\r\n" + 
			"";
	
	
	
	public String C2TA_update_get="/api/read.php?id=1301";
	
	public String C2TA_Post_resource="/api/insert.php";
	
	
	public String C2TA_get_resource="/api/read.php";
	
	public String C2TA_put_resource="/api/update.php";
	
	public String C2TA_delete_resource="/api/delete.php";
	
	
	

}
