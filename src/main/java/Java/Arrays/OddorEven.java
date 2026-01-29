package Java.Arrays;

public class OddorEven {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 6, 7, 8, 10, 12, 16, 17, 19, 20 };

		System.out.println("Even numbers: ");
		for (int num : a) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}

		System.out.println("\nOdd numbers: ");
		for (int num : a) {
			if (num % 2!= 0) {
				System.out.print(num + " ");
			}
		}

	}

}
