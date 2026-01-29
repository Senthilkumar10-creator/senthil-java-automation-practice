package Java.oops.Abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		
		Abstractphone phone = new AbstractIphone();
		phone.turnOn();
		phone.makeCall();
		phone.turnOff();
		phone.nonAbstarct();
	}

}
