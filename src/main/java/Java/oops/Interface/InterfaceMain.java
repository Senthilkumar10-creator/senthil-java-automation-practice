package Java.oops.Interface;

public class InterfaceMain implements InterfaceShape {

	public void square() {
		System.out.println("This is square");
	}

	public static void main(String[] args) {

		// child class reference
		InterfaceMain main = new InterfaceMain();
		main.square();
		main.circle();
		InterfaceShape.rectangle();
		System.out.println(InterfaceShape.length);
		System.out.println(InterfaceShape.width);

		System.out.println("--------------");

		// parent class reference
		InterfaceShape ifShape = new InterfaceMain();
		ifShape.square();
		ifShape.circle();
		InterfaceShape.rectangle();

	}

}
