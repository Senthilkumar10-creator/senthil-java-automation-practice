package Java.oops.Polymorphism;

public class ConstructorOverloading {
	
	/* 
	 * 1.Constructor is a special method it is used to initialize the objects 
	 * 2.Constructor is automatically called when object of the class is created 
	 * 3.Constructor does not have any return type , not even void 
	 * 4.Constructor name should be same as class name 
	 * 5.Constructor can take Parameters and arguments
	 */

	
	ConstructorOverloading(int a){
		System.out.println("First constructor is called");
	}
	
   ConstructorOverloading(int a , double b){
		System.out.println("Second constructor is called");
	}
	
	
   ConstructorOverloading(int a , double b , String c){
	System.out.println("Third constructor is called");
  }
	
   ConstructorOverloading(){
		System.out.println("Default constructor is called");
	}
	
	
	
	public static void main(String[] args) {
		
		new ConstructorOverloading();
		new ConstructorOverloading(100);
		new ConstructorOverloading(50,50.0);
		new ConstructorOverloading(50 , 100.0 , "Hundred");

	}

}
