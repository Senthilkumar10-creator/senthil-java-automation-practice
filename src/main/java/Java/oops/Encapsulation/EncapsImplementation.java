package Java.oops.Encapsulation;

public class EncapsImplementation {

	public static void main(String[] args) {

		PojoClass access = new PojoClass();
		access.setId(10);
		access.setName("SACHIN");
		access.setMark(100.00);
		access.setGrade('A');
		access.setAccountactive(true);

		System.out.println("Account user Id is: " + access.getId());
		System.out.println("Account user Name is: " + access.getName());
		System.out.println("Account user Mark is: " + access.getMark());
		System.out.println("Account user Grade is: " + access.getGrade());
		System.out.println("Account user account is active?: " + access.getAccountactive());

	}

}
