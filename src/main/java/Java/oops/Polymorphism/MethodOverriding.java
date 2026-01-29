package Java.oops.Polymorphism;

class Bank {

	double ROI() {
		return 0;
	}
}

class HDFC extends Bank {
	double ROI() {
		return 10.5;
	}
}

class ICICI extends Bank {
		double ROI() {
			return 12.5;
		}
}
class SCB extends Bank{
			double ROI() {
				return 14.5 ;
			}	
				
}

class MethodOverriding {
	
	public static void main (String[] args) {
		
		HDFC hdfc =  new HDFC();
		ICICI icici = new ICICI();
		SCB scb = new SCB();
		
		System.out.println(hdfc.ROI());
		System.out.println(icici.ROI());
		System.out.println(scb.ROI());
		
	}
}

