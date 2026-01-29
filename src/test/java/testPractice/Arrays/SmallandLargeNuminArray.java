package testPractice.Arrays;

public class SmallandLargeNuminArray {

	public static void main(String[] args) {

		int a[] = { 5, 2, 8, 9, 19, 8, 3 };

		int small = a[0];
		int large = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
			if (a[i] < small) {
				small = a[i];
			}
		}

		System.out.println("small : " + small);
		System.out.println("large : " + large);
	}

}
