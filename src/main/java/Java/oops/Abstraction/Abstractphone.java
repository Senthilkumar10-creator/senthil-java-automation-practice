package Java.oops.Abstraction;

public abstract class Abstractphone{
	
	/*
	 * Abstraction is process of hiding the implementation details and showing only
	 * essential details to the user.
	 */
	
	/*
	 * 1. Abstract class have both abstract and non abstract methods 
	 * 2. Abstract class does not support multiple inheritance 
	 * 3. Abstract class can have final and non final , static and non static variables 
	 * 4. Abstract class can be extended using "extends" keyword 
	 * 5. Abstract class can have class members like private and protected
	 */
	
	
	public abstract void turnOn() ;
	public abstract void makeCall();
	public abstract void turnOff();
	
	public void nonAbstarct() {
		System.out.println("Calling non abstarct methods");
	}
}

