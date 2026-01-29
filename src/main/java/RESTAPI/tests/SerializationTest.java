package RESTAPI.tests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import RESTAPI.payLoads.Location;
import RESTAPI.payLoads.PojoGoogleAPIPayload;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SerializationTest {
	
 @Test	
 public void pojoSerilizationTest() {
	 
	 RestAssured.baseURI = "https://rahulshettyacademy.com";
	 
	 PojoGoogleAPIPayload payload = new PojoGoogleAPIPayload();
	 Location loc = new Location();
	 loc.setLat(-38.383494);
	 loc.setLng(33.427362);
	 
	 List <String> typesList = new ArrayList<String>();
	 typesList.add("shoe park");
	 typesList.add("shop");
	 
	 payload.setLocation(loc);
	 payload.setAccuracy(50);
	 payload.setName("Senthil Kumar");
	 payload.setPhone_number("(+91) 983 893 3937");
	 payload.setAddress("Chennai");
	 payload.setTypes(typesList);
	 payload.setWebsite("http://google.com");
	 payload.setLanguage("French-IN");
	 
	 
	 Response response = given()
	   .queryParam("key ", "qaclick123")
	   .header("Content-Type", "application/json")
	   .relaxedHTTPSValidation()
	   .log().all()
	 .when()
	 .body(payload)
	 .log().all()
	 .post("/maps/api/place/add/json");
	 
	 
	 String ResponeString = response.then().extract().asString();
	 System.out.println(ResponeString);
	  
	 
 }

}
