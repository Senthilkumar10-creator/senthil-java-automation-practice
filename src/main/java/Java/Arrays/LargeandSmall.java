package Java.Arrays;

public class LargeandSmall {

	public static void main(String[] args) {
		
		int a[] = {10, 20 ,30, 30, 40 ,40 ,50 ,60};
		
		int small = a[0];
		int large = a[0];
		
		for (int i =0 ; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}if(a[i] < small) {
				small = a[i];
			}
		}

		System.out.println("Largest number: " + large);
		System.out.println("Smallest number: " + small);
		
	}

}
