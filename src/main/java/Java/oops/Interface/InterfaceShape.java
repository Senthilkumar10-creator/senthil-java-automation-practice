package Java.oops.Interface;

public interface InterfaceShape {
	
	int length = 10;
	int width = 20 ;
	
	//Abstract method
	void square();
	
	//default method
	default void circle() {
		System.out.println("This is circle");
	}
	
	//static method
	static void rectangle() {
		System.out.println("This is rectangle");
	}

}
