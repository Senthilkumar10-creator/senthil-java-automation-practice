package testPractice.Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class ArrayPro {

	@Test
	public void largeSmall() {

		int arr[] = { 2, 3, 5, 6, 7, 99, 5 };

		int large = arr[0];
		int small = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
			if (arr[i] < small) {
				small = arr[i];
			}
		}

		System.out.println(large);
		System.out.println(small);

	}

	@Test
	public void SecLargesecSmall() {

		int arr[] = { 1, 4, 2, 3, 5, 6, 7, 99, 5, 456 };

		Arrays.sort(arr);

		int small = arr[0];
		int large = arr[arr.length - 1];
		Integer secSmall = null, secLarge = null;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < large) {
				secLarge = arr[i];
				break;
			}
		}

		for (int num : arr) {
			if (num > small) {
				secSmall = num;
				break;
			}
		}

		System.out.println(secSmall);
		System.out.println(secLarge);

	}

	@Test
	public void remDup() {

		int arr[] = { 2, 3, 4, 6, 2, 2, 2, 8, 9, 98, 56 };

		HashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int num : arr) {
			set.add(num);
		}

		System.out.println(set);

	}

	@Test
	public void printDup() {

		int arr[] = { 1, 2, 3, 4, 5, 3, 2, 4, 5 };

		HashSet<Integer> set = new HashSet<>();

		for (int num : arr) {
			if (!set.add(num)) {
				System.out.print(num + " ");
			}
		}

	}

	@Test
	public void missingNum() {
		int arr[] = { 1, 2, 3, 5, 6, 7, 8 };

		HashMap<Integer, Boolean> map = new LinkedHashMap<>();

		for (int num : arr) {
			map.put(num, true);
		}

		System.out.println("Missing number from the array: ");
		for (int i = 1; i < arr.length - 1; i++) {
			if (!map.containsKey(i)) {
				System.out.print(i + " ");
			}
		}

	}

	@Test
	public void uniqueElements() {

		int arr[] = { 1, 2, 1, 3, 5, 6, 6, 7, 8 };

		HashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}

	@Test
	public void commonElement() {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 5, 6, 7 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}

	}

	@Test
	public void mergeArray() {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 6, 7, 8, 9, 10 };

		int res[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			res[arr1.length + i] = arr2[i];
		}

		for (int num : res) {
			System.out.print(num + " ");
		}

	}

	@Test
	public void bubbleSort() {
		int[] arr = { 6, 3, 4, 6, 7, 9, 0, 15, 45 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}

	}

}
