package Java.oops.Inheritance;

public class ChildClass extends ParentClass {

	int multiply;

	String Emp_Dep = "CSE";

	void multiplyValue(int a, int b) {
		System.out.println("This is derived from Child Class");
		multiply = a * b;
		System.out.println("The Multiply value of given two number: " + multiply);
	}

	void displayEmployeeDetail() {
		System.out.println("This is derived from Child Class");

		System.out.println("Employee Name is: " + Emp_Dep);
	}

	public static void main(String[] args) {
		ChildClass access =  new ChildClass();
		
		access.addition(10, 10);// Parent
		access.multiplyValue(10, 10); // Child
		
		access.displayEmployee();
		access.displayEmployeeDetail();
	}

}
