package testPractice.Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintDupinArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 30, 40, 40, 50, 60, 60 };

		HashSet<Integer> set = new LinkedHashSet<Integer>();

		System.out.println("Duplicate values: ");
		for (int num : a) {
			if (!set.add(num)) {
				System.out.println(num);
			}
		}

	}

}
