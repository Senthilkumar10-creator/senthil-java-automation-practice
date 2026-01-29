package restAssured;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RestAssuredTestDe {
	
	//Given - auths, queryParam, path params, header, body
	//when = method
	//then = assertion, response code, response time , status line
	
	String baseurl = "https://restful-booker.herokuapp.com/booking";
	int id;
	    
	     @Test(priority = 1)
	     public void getMethod() {
	    	 
	    	 
	    	given()
	    	.contentType("application/json")
	    	.pathParam("id", id)
	    	.relaxedHTTPSValidation()
	    	.log().all()
	    	.when()
	    	.get(baseurl + "/{id}")
	    	.then()
	    	.log().all()
	    	.assertThat()
	    	.statusCode(200)
	    	.and()
	    	.statusLine(Matchers.containsString("OK"));
	    	     	 
	     }
	     
	     
	     @Test(priority = 0)
	     public void postTest() {
	    	 
	    	 String postPayload = "{\r\n"
	    	 		+ "  \"firstname\" : \"Raja\",\r\n"
	    	 		+ "  \"lastname\" : \"Brown\",\r\n"
	    	 		+ "  \"totalprice\" : 111,\r\n"
	    	 		+ "  \"depositpaid\" : true,\r\n"
	    	 		+ "  \"additionalneeds\" : \"Breakfast\",\r\n"
	    	 		+ "  \"bookingdates\" : {\r\n"
	    	 		+ "    \"checkin\" : \"2013-02-23\",\r\n"
	    	 		+ "    \"checkout\" : \"2014-10-23\"\r\n"
	    	 		+ "  }\r\n"
	    	 		+ "}";
	    	 
	    Response postResponse =
	    		 given()
	    	    .header("Content-Type", "application/json")
	    	    .relaxedHTTPSValidation()
	    	    .body(postPayload)
	    	 .when()
	    	     .post(baseurl);
	    
	    
	  String postResString =  postResponse.asString();
	    
	    JsonPath js = new JsonPath(postResString);
	    id = js.get("bookingid");
	    System.out.println(id);
	   
	     }
	     
	    
	     
	     @Test(priority = 2)
	     public void putTest() {
	    	 
	    	String putPayload = "{\r\n"
	    			+ "    \"firstname\" : \"Raja\",\r\n"
	    			+ "    \"lastname\" : \"Brown\",\r\n"
	    			+ "    \"totalprice\" : 111,\r\n"
	    			+ "    \"depositpaid\" : true,\r\n"
	    			+ "    \"bookingdates\" : {\r\n"
	    			+ "        \"checkin\" : \"2018-01-01\",\r\n"
	    			+ "        \"checkout\" : \"2019-01-01\"\r\n"
	    			+ "    },\r\n"
	    			+ "    \"additionalneeds\" : \"bowling\"\r\n"
	    			+ "}" ;
	    	 
	    	 
	    	Response putResponse =  given()
	    	    .header("Content-Type","application/json")
	    	    .header("Cookie", "token=3e71c4ca3a15a20")
	    	    .relaxedHTTPSValidation()
	    	    .pathParam("id", id)
	    	    .log().all()
	    	 .when()
	    	    .body(putPayload)
	    	    .put(baseurl + "/{id}");
	    	    
	    	    
	    	putResponse.then().log().all();	 
	    	  
	    	 
	    	 
	     }
	     
	     
	     
	    @Test(priority = 3)
	     public void deletePost() {
	    	 
	    	
	    	Response deleteRes = given()
	    	   .header("Content-Type", "apploication/json")
	    	   .header("Cookie", "token=3e71c4ca3a15a20")
	    	   .relaxedHTTPSValidation()
	    	   .pathParam("id", id)
	    	   .log().all()
	    	.when()
	    	   .delete(baseurl + "/{id}");
	    	
	    	int deletestatusCode = deleteRes.getStatusCode();
	    	Assert.assertEquals(deletestatusCode, 201);    	
	    	
	     }    


}
