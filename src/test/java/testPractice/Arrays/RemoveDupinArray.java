package testPractice.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupinArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 3, 4, 5, 6, 8, 7, 3 };

		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int num : a) {
			set.add(num);
		}

		System.out.println("After removing: " + set);

	}

}
