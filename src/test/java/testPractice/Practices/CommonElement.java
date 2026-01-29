package testPractice.Practices;

import java.util.HashSet;

public class CommonElement {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 5, 7, 4, 9, 3, 1 };

		HashSet<Integer> set = new HashSet<>();

		for (int n : arr1) {
			set.add(n);
		}

		HashSet<Integer> result = new HashSet<>();

		for (int n : arr2) {
			if ((set.contains(n)) && (n % 2 == 0)) {
				result.add(n);
			}
		}

		System.out.println(result);

	}

}
