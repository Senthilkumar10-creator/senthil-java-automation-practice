package testPractice.Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ArrayProblems {

	@Test
	public void largeNum() {
		int[] a = { 3, 4, 34, 1, 67, 89, 98, 45, 63 };

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

		System.out.println(large);
		System.out.println(small);

	}

	@Test
	public void secSmallAndLarge() {

		int[] a = { 3, 4, 34, 1, 67, 89, 98, 45, 63 };

		Arrays.sort(a);
		int small = a[0];
		int large = a[a.length - 1];
		Integer secSmall = null, secLarge = null;

		for (int i = a.length - 1; i >= 0; i--) {
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

		System.out.println("Second largest num in the array" + secLarge);
		System.out.println("Second Smallest num in the array" + secSmall);

	}

	@Test
	public void remDup() {
		int a[] = { 1, 2, 3, 3, 4, 4, 5, 6, 7, 8 };

		HashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int n : a) {
			set.add(n);
		}

		System.out.println(set);

	}

	@Test
	public void PrintDup() {
		int a[] = { 1, 2, 3, 3, 4, 4, 5, 6, 7, 8 };

		HashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int n : a) {
			if (!set.add(n)) {
				System.out.print(n + " ");
			}
		}

	}

	@Test
	public void missingNum() {

		int a[] = { 1, 2, 3, 4, 6, 7, 8 };
		int n = a.length - 1;
		HashMap<Integer, Boolean> map = new LinkedHashMap<Integer, Boolean>();

		for (int num : a) {
			map.put(num, true);
		}

		for (int i = 1; i <= n; i++) {
			if (!map.containsKey(i)) {
				System.out.println(i);
			}
		}

	}

	@Test
	public void mergeTwoArray() {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };

		int res[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			res[arr1.length + i] = arr2[i];
		}

		for (int n : res) {
			System.out.print(n + " ");
		}

	}

	@Test
	public void commonElement() {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8, 4, 3 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j] && arr1[i] % 2 == 0) {
					System.out.println(arr1[i]);
				}
			}
		}

	}

	@Test
	public void bubblesort() {
		int[] arr = { 6, 3, 4, 6, 7, 9, 0, 15, 45 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	@Test
	public void removeDupWord() {
		String str = "I am am Automation Tester Tester am Tester";

		HashSet<String> set = new LinkedHashSet<String>();

		String[] words = str.split(" ");

		for (String word : words) {
			set.add(word);
		}

		for (String output : set) {
			System.out.print(output + " ");
		}
	}

	@Test
	public void replacetommorow() {
		String input = "tommorow";
		int count = 1;

		StringBuilder sb = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (c == 'o') {
				for (int i = 0; i < count; i++) {
					sb.append("$");
				}
				count++;
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

	}

	@Test
	public void common() {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8, 4, 3 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr2[j] + " ");
				}
			}
		}
	}

	@Test
	public void merge() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 6, 7, 8, 4, 3 };

		int res[] = new int[arr1.length + arr2.length];
		// int arr[] = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			res[i] = arr1[i];
		}

		for (int j = 0; j < arr2.length; j++) {
			res[arr1.length + j] = arr2[j];
			res[5] = arr2[0];
		}

		for (int num : res) {
			System.out.print(num + " ");
		}

	}

	@Test
	public void nonRepeated() {

	}

}
