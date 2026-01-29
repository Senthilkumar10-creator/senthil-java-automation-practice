package RESTAPI.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import RESTAPI.payLoads.PayLoads;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class DataProviderTest {
	
	@Test (dataProvider = "BookData")
	public void addBooks(String isbn , String csbn) {
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		String responseString = given()
		  .header("Content-Type", "application/json")
          .log().all()
        .when()
          .body(PayLoads.addBooks(isbn, csbn))
          .post("Library/Addbook.php")
        .then()
          .assertThat()
          .log().all()
          .statusCode(200)
          .extract()
          .asString();
		
		JsonPath js = new JsonPath(responseString);
		String id = js.getString("ID");
		System.out.println(id);
	}
	
	
	@DataProvider (name = "BookData")
	public Object[][] payLoad(){
		
		return new  Object[][] { {"isbn", "3067"} ,
			                     {"csfg" , "2165"},
			                     {"thyu" , "5412"}	
		};
		
		
		
	}
	
	
	
	
	
	
	
	

}
