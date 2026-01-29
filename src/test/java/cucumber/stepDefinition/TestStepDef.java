package cucumber.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDef {
	
	@Given("Print the Step one")
	public void print_the_step_one() {
	    System.out.println("Prints step 1");
	}
	@When("Print the Step two")
	public void print_the_step_two() {
		 System.out.println("Prints step 2");
	}
	@Then("Print the step three")
	public void print_the_step_three() {
		 System.out.println("Prints step 3");
	}


}
