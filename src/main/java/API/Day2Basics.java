package API;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class Day2Basics {

	
	//@Test
	public void getRequest() {
		
		baseURI = "https://jsonplaceholder.typicode.com/users";
		
		given()
		.when()
		.get("/1")
		.then()
		.log()
		.all()
		.statusCode(200)
		.statusLine(Matchers.containsString("OK"))
		.time(Matchers.lessThan(5000L));
		
	}	
		
	@Test
     public void postRequest() {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
		
		/*given()
		.log()
		.all()
		.body("\name\"= \"Leanne Graham")
		.when()
		.post()
		.then()
		.log()
		.all()
		.statusCode(201)
		.statusLine(Matchers.containsString("OK"))
		.time(Matchers.lessThan(5000L));*/
		
		
		
		given().body("\name\"= \"Leanne Graham").when().post().then().statusCode(201).body("id", equalTo(11)).log().all();
		
	}	
		
		

	

}
