package Java.Arrays;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		
		int a[] = {10, 20 ,30, 30, 40 ,40 ,50 ,60};
		
		int rev[] = new int[a.length];
		
		System.out.println("Original Array: " + Arrays.toString(a));
		
		for (int i =0 ; i< a.length; i++) {
			rev[i] = a[a.length-1-i];
		}
		
		System.out.println("Original Array: " + Arrays.toString(rev));
		
	}

}
