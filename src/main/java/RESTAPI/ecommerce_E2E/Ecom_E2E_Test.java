package RESTAPI.ecommerce_E2E;
import org.testng.Assert;
import org.testng.annotations.*;

import RESTAPI.deserialization_Responses.LoginResponse;
import RESTAPI.payLoads.CretaeOrderPayload;
import RESTAPI.payLoads.EcomLoginPayload;
import RESTAPI.payLoads.OrderDetails;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class Ecom_E2E_Test {
	
	String token;
	String userId;
	String productId;
	
	// Login into Ecom Website
	
	@Test(priority = 0)
	public void loginSite() {
		
	RequestSpecification loginBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.setContentType("application/json").setRelaxedHTTPSValidation().build();
	
	EcomLoginPayload payload = new EcomLoginPayload();
	payload.setUserEmail("Hitman264@gmail.com");
	payload.setUserPassword("Rohit@264");
		
	RequestSpecification loginResponse = given().log().all().spec(loginBaseReq).body(payload);
	
	LoginResponse LoginRes = loginResponse.when().post("/api/ecom/auth/login")
	                         .then().extract().response().as(LoginResponse.class);
	
	token = LoginRes.getToken();
	System.out.println("Token: " + token);
	userId = LoginRes.getUserId();
	System.out.println("User Id: " + userId);
	
	}
	
	// Add new product in Ecom website
	@Test(priority = 1)
	public void addproduct() {
		
		RequestSpecification addProductReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
			.addHeader("Authorization", token).setRelaxedHTTPSValidation().build();
		
		RequestSpecification addProductResponse = given().spec(addProductReq).param("productName", "Hitman")
		 .param("productAddedBy", userId).param("productCategory", "fashion")
		 .param("productSubCategory", "shirts").param("productPrice","11000")
		 .param("productDescription", "Addias Originals").param("productFor", "men")
		 .multiPart("productImage",new File("C:\\Users\\dsenthi1\\Downloads\\img.jpg"));
		
		
		String addProductRes = addProductResponse.when().post("/api/ecom/product/add-product")
		.then().log().all().extract().asString();
		
		JsonPath js = new JsonPath(addProductRes);
		productId = js.getString("productId");
		Assert.assertEquals(js.getString("message"), "Product Added Successfully", "Response message not matching");
				
	}
	
	// Create new order
	
	@Test(priority = 2)
	public void createOrder() {
		
		RequestSpecification createOrderReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType("application/json").addHeader("Authorization", token).setRelaxedHTTPSValidation().build();
		
		//builted nested json --> pojo
		
		OrderDetails details = new OrderDetails();
		details.setCountry("India");
		details.setProductOrderedId(productId);
		
		List <OrderDetails> orderList = new ArrayList<OrderDetails>();
		orderList.add(details);
		
		CretaeOrderPayload order = new CretaeOrderPayload();
		order.setOrders(orderList);
		
		
		RequestSpecification createOrderResponse = given().log().all().spec(createOrderReq)
				                                   .body(order);
		
		String createOrderRes = createOrderResponse.when().post("/api/ecom/order/create-order")
				          .then().log().all().extract().asString();
		
		JsonPath js = new JsonPath(createOrderRes);
		
		// Extract the first order ID from the "orders" array
		String orderId = js.getString("orders[0]");
		System.out.println("Order ID: " + orderId);
         Assert.assertEquals(js.getString("message"), "Order Placed Successfully", "Response message not matching");
		
	}
	
	// delete the order
	
	@Test(priority = 3)
	public void deleteOrder() {
		
		RequestSpecification deleteOrderReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.addHeader("Authorization", token)
		.setRelaxedHTTPSValidation().build();
		
		RequestSpecification deleteOrderResponse = given().log().all().spec(deleteOrderReq).pathParam("productId", productId);
		
		String deleteOrderRes = deleteOrderResponse.when().delete("/api/ecom/product/delete-product/{productId}")
		.then().log().all().extract().asString();
		
		JsonPath js = new JsonPath(deleteOrderRes);
		Assert.assertEquals(js.getString("message"), "Product Deleted Successfully", "Response message not matching");
		
	
	}
	
	

}
