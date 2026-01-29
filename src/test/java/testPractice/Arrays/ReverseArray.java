package testPractice.Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 6, 7, 8, 9 };
		int rev[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			rev[i] = a[a.length - 1 - i];

		}
		
		System.out.println(Arrays.toString(rev));

	}

}
