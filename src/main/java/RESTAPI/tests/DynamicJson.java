package RESTAPI.tests;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import RESTAPI.payLoads.PayLoads;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {

	static String id;

	@Test(priority = 0)
	public void addBook() {

		RestAssured.baseURI = "http://216.10.245.166";

		String responseBody = given().header("Content-Type", "application/json").log().all().when()
				.body(PayLoads.addBooks("isbn", "3267")).post("Library/Addbook.php").then().log().all().assertThat()
				.statusCode(200).extract().asString();

		JsonPath js = new JsonPath(responseBody);
		id = js.get("ID").toString();
		System.out.println(id);
	}

	@Test(priority = 1)
	public void getBookDetails() {

		RestAssured.baseURI = "http://216.10.245.166";

		given().queryParam("ID", id).log().all().when().get("Library/GetBook.php").then().log().all().statusCode(200);

	}

	@Test(priority = 2)
	public void deleteBookDetail() {
		RestAssured.baseURI = "http://216.10.245.166";

		HashMap<String, String> map = new HashMap<>();
		map.put("ID", id);

		given().header("Content-Type", "application/json").log().all().when().body(map).post("/Library/DeleteBook.php")
				.then().log().all().statusCode(200);

	}

}
