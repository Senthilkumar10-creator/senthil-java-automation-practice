package RESTAPI.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import RESTAPI.payLoads.PayLoads;
import io.restassured.path.json.JsonPath;

public class CourseDetailValidations {
	
	JsonPath js = new JsonPath(PayLoads.courseDetails());
	int count = js.getInt("courses.size()");
	
	
	//1. Print No of courses returned by API
    @Test(enabled = false)
	public void printNoofCourses() {
		
		System.out.println("No of courses present in the json: " + count);	
		
	}
    
    //2.Print Purchase Amount
    @Test(enabled = false)
    public void printPurchaseAmt() {
    	int PurchaseAmt = js.getInt("dashboard.purchaseAmount");
    	System.out.println("Purchase Amount: " + PurchaseAmt);
    }
    
    
    //3. Print Title of the first course
    @Test(enabled = false)
    public void printTitleofFirstCourse() {
    	String titleofFirstCourse = js.get("courses[0].title").toString();
    	System.out.println("Title of First Course: " + titleofFirstCourse);
    }
	
	//4. Print All course titles and their respective Prices
    @Test(enabled = false)
    public void printAllCoursesandPrices() {
    	
    	for(int i=0 ; i<count; i++) {
    		String allCourses = js.get("courses["+i+"].title").toString();
    		int allprices = js.getInt("courses["+i+"].price");
    		System.out.println("Title :" + allCourses +" - " + "Price :" + allprices );
    	}
    }
    
    //5. Print no of copies sold by RPA Course
    @Test(enabled = false)
    public void printNoofCopiesbyRPA() {
    	String ExpectedTitle = "RPA";
    	for(int i=0; i<count ; i++) {
    		String courseTitle = js.get("courses["+i+"].title").toString();
    		if(courseTitle.equalsIgnoreCase(ExpectedTitle)) {
    			int noOfCopiesbyRpa = js.getInt("courses["+i+"].copies");
    			System.out.println("No of Copies by RPA Course: " + noOfCopiesbyRpa);
    		}
    	}
    }
	
	//6.Verify if Sum of all Course prices matches with Purchase Amount
    
    @Test(enabled = true)
    public void verifySumofAllCourses() {
    	int sum = 0;
    	for(int i=0; i<count; i++) {
    		
    		int price = js.getInt("courses["+i+"].price");
    		int copies = js.getInt("courses["+i+"].copies");
    		int amount = price * copies;
    		sum = sum + amount;
    		//System.out.println("Sum of All Courses: " + sum);
    		
    	}
    	
    	int PurchaseAmt = js.getInt("dashboard.purchaseAmount");
    	System.out.println("Sum of All Courses: " + sum);
    	Assert.assertEquals(sum, PurchaseAmt, "Sum of all courses is not matching with PurchaseAmt");
    	    	
    	
    }
    
    
       

}
