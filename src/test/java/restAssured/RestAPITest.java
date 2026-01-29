package restAssured;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAPITest {
	
	String baseuri = "https://restful-booker.herokuapp.com/booking";
	int id;
	
	
	//@Test
	public void getTest() {
		
		given()
		.header("Content-Type","application/json")
		.relaxedHTTPSValidation()
		.log()
		.all()
		.when()
		.get(baseuri)
		.then()
		.assertThat()
		.statusCode(200)
		.and()
		.statusLine(Matchers.containsString("OK"));
		
	}
	
	@Test(priority = 0)
	public void postTest() {
		
		
		String payLoad = "{\r\n"
				+ "  \"firstname\" : \"Sally\",\r\n"
				+ "  \"lastname\" : \"Brown\",\r\n"
				+ "  \"totalprice\" : 111,\r\n"
				+ "  \"depositpaid\" : true,\r\n"
				+ "  \"additionalneeds\" : \"Breakfast\",\r\n"
				+ "  \"bookingdates\" : {\r\n"
				+ "    \"checkin\" : \"2013-02-23\",\r\n"
				+ "    \"checkout\" : \"2014-10-23\"\r\n"
				+ "  }\r\n"
				+ "}";
		
	Response posRes =	given()
		.contentType("application/json")
		.relaxedHTTPSValidation()
		.log().all()
	   .when()
	    .body(payLoad)
	    .post(baseuri);
	
	   posRes.then().log().all();
	   String postResponseString = posRes.asString();
	   JsonPath js = new JsonPath(postResponseString);
	   String firstname = js.get("booking.firstname");
	   System.out.println(firstname);
	   Assert.assertEquals(firstname, "Sally");
	   id = js.getInt("bookingid");
		
	}
	
	@Test(priority = 1)
	public void fetchParticularData() {
		
		given()
		.contentType("application/json")
		.pathParams("id", id)
		.relaxedHTTPSValidation()
		.log().all()
	    .when()
	    .get(baseuri+ "/{id}")
	    .then()
	    .assertThat()
	    .statusCode(200)
	    .and()
	    .statusLine(Matchers.containsString("OK"));
		
	}
	

	@Test(priority = 2)
	public void putTest() {
		
		String putPayload = "{\r\n"
				+ "    \"firstname\" : \"James\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"bowling\"\r\n"
				+ "}";
		
		
		Response res = given()
		.contentType("application/json")
		.header("Cookie", "token=5e7928baeab8fbc")
		.pathParam("id", id)
		.relaxedHTTPSValidation()
		.log().all()
		.when()
		.body(putPayload)
		.put(baseuri+ "/{id}");
		
		res.then().log().all();
	
	}
	
	@Test(priority = 3)
	public void deleteTest() {
		
		given()
		 .contentType("application/json")
		 .header("Cookie", "token=5e7928baeab8fbc")
		 .pathParam("id", id)
		 .relaxedHTTPSValidation()
		 .log().all()
		 .when()
		 .delete(baseuri+ "/{id}")
		 .then()
		 .assertThat()
		    .statusCode(403);
		    
	}
	
	
	//@Test
	public void createToken() {
		
		String authuri = "https://restful-booker.herokuapp.com/auth";
		String authBody = "{\r\n"
				+ "    \"username\" : \"admin\",\r\n"
				+ "    \"password\" : \"password123\"\r\n"
				+ "}";
		
		given()
		.contentType("application/json")
		.relaxedHTTPSValidation()
		.log().all()
		.when()
		.body(authBody)
		.post(authuri)
		.then()
		.assertThat()
		.statusCode(200);
		
	}
	
}
