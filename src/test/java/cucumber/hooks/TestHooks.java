package cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {

	@Before(order = 0)
	public void beforetest1() {
		System.out.println("Prints the BeforeTest 1");
	}
	@Before(order = 1)
	public void beforetest2() {
		System.out.println("Prints the BeforeTest 2");
	}
	@Before(order = 2)
	public void beforetest3() {
		System.out.println("Prints the BeforeTest 3");
	}
    @After(order = 2)
	public void aftertest1() {
		System.out.println("Prints the AfterTest 1");
	}
    @After(order = 1)
	public void aftertest2() {
		System.out.println("Prints the AfterTest 2");
	}
    @After(order = 0)
	public void aftertest3() {
		System.out.println("Prints the AfterTest 3");
	}

}
