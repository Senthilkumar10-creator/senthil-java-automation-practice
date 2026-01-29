package testPractice.Strings;

import java.util.LinkedHashSet;

public class RemoveDupinString {

	public static void main(String[] args) {

		String input = "I am Automation tester";
		String replaceAll = input.replaceAll("\\s+", "");

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (char c : replaceAll.toCharArray()) {
			set.add(c);
		}

		StringBuilder result = new StringBuilder();

		for (char c : set) {
			result.append(c);
		}

		System.out.println(result.toString());
	}

}
