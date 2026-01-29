package testPractice.Arrays;

public class OddorEveninArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Even number: ");
		for (int num : a) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}

		System.out.print("\nOdd number: ");
		for (int num : a) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}

	}

}
