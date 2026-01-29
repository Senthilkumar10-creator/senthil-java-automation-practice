package sample.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class ArrayProblems {

	@Test
	public void largeSmall() {

		int a[] = { 10, 20, 30, 40, 50 };

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

		System.out.println("large: " + large);
		System.out.println("small: " + small);

	}

	@Test
	public void secLargesecSmall() {

		int a[] = { 10, 20, 30, 40, 50 };

		Arrays.sort(a);

		int small = a[0];
		int large = a[a.length - 1];
		Integer secSmall = null, secLarge = null;

		for (int i = a.length - 1; i > 0; i--) {
			if (a[i] < large) {
				secLarge = a[i];
				break;
			}
		}

		for (int num : a) {
			if (num > small) {
				secSmall = num;
				break;
			}
		}

		System.out.println("Seclarge: " + (secLarge != null ? secLarge : "None"));
		System.out.println("Secsmall: " + (secSmall != null ? secSmall : "None"));

	}

	@Test
	public void remDup() {

		int a[] = { 10, 10, 20, 30, 20, 30, 40, 50 };

		System.out.println("Before removing dup: " + Arrays.toString(a));
		HashSet set = new LinkedHashSet();

		for (int num : a) {
			set.add(num);
		}

		System.out.println("After removing dup: " + set);

	}

	@Test
	public void printDup() {

		int a[] = { 10, 10, 20, 30, 20, 30, 40, 50 };

		System.out.println("input array: " + Arrays.toString(a));

		HashSet set = new LinkedHashSet();

		System.out.println("Duplicate values from the array: ");
		for (int num : a) {
			if (!set.add(num)) {
				System.out.print(num + " ");
			}
		}

	}

	@Test
	public void uniqueValues() {

		int a[] = { 10, 10, 20, 30, 20, 30, 40, 50 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : a) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println("uniques values from the array");

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}

}
