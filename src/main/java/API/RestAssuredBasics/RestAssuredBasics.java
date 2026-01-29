package API.RestAssuredBasics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class RestAssuredBasics {

	@Test
	public void getRequest() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";

		given().when().get();

	}

}
