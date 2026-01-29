package RESTAPI.tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OauthTest {
	
	static String token ;
	
	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
	}
	
	@Test (priority  = 0) 
	public void oauthCreation() {
		
	Response createTokenResponse  = 
		given()
		 .formParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		 .formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		 .formParams("grant_type", "client_credentials")
		 .formParams("scope", "trust")
		 .relaxedHTTPSValidation()
		 .log().all()
	   .when()
	     .post("/oauthapi/oauth2/resourceOwner/token");
	
	String createToken = createTokenResponse.then().log().all().extract().asString();
	
	JsonPath js = new JsonPath(createToken);
	token = js.getString("access_token");
    System.out.println("Token: " + token);	
	}
	
	@Test (priority = 1)
	public void getCourseDetails() {
		
		Response getCourseResponse = given()
		   .queryParam("access_token", token)
		   .relaxedHTTPSValidation()
		   .log().all()
		.when()
		   .get("/oauthapi/getCourseDetails");
		
		getCourseResponse.then().log().all()
		.extract().asString();
		
		
	}
	
	
	
	
	

}
