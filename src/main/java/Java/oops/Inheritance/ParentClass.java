package Java.oops.Inheritance;

public class ParentClass {

	int add;

	int Emp_id = 45;
	String Emp_name = "Rohit";

	void addition(int a, int b) {
		System.out.println("This is derived from Parent Class");
		add = a + b;
		System.out.println("The Addition value of given two number: " + add);
	}

	void displayEmployee() {
		System.out.println("This is derived from Parent Class");

		System.out.println("Employee Id is: " + Emp_id);
		System.out.println("Employee Name is: " + Emp_name);
	}

}
