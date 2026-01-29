package Java.oops.Polymorphism;

public class MethodOverloading {

	public void display(int a) {
		System.out.println("The value of a: " + a);
	}
	
	public void display(int a , int b) {
    	System.out.println("The value of a: " + a + " , The value of b: " + b);
	}
	
	public void display(int a , int b , int c) {
    	System.out.println(("The value of a: " + a + " , The value of b: " + b + " , The value of c: " + c ));
	}
	
	
	public static void main(String[] args) {
		MethodOverloading display = new MethodOverloading();
		display.display(1,2,3);
		display.display(1,2);
		display.display(1);
	}

}
