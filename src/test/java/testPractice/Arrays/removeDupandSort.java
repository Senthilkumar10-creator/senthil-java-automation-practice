package testPractice.Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDupandSort {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 5, 6, 6, 7, 8, 8, 9 };

		Set<Integer> set = new LinkedHashSet<>();

		for (int num : a) {
			set.add(num);
		}

		System.out.println(set);

		List<Integer> list = new ArrayList<>(set);

		for (int num : list) {
			System.out.println(num);
		}

	}

}
