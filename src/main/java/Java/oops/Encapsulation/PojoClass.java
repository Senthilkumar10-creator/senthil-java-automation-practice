package Java.oops.Encapsulation;

public class PojoClass {

	/*
	 * Encapsulation in Java is a process of wrapping the data and code in a single
	 * unit. The whole idea behind encapsulation is to hide the implementation
	 * details from users. If a data member is private it means it can only be
	 * accessed within the same class. No outside class can access private data
	 * member (variable) of other class
	 */
	
	
	/*
	 * To achieve encapsulation in Java −

	 * Declare the variables of a class as private. Provide public setter and getter
	 * methods to modify and view the variables values Variable can operate only
	 * through getter and setter methods
	 */
	
	
	
	private int id;
	private String name;
	private double mark;
	private char grade;
	private boolean accountActive;

	public int getId() {
		return id;
	}

	public void setId(int setId) {
		this.id = setId;
	}

	public String getName() {
		return name;
	}

	public void setName(String setName) {
		this.name = setName;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double setMark) {
		this.mark = setMark;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char setGrade) {
		this.grade = setGrade;
	}

	public boolean getAccountactive() {
		return accountActive;
	}

	public void setAccountactive(boolean setAccountactive) {
		this.accountActive = setAccountactive;
	}

}
