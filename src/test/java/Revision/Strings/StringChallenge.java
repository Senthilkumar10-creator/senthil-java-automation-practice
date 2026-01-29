package Revision.Strings;

import java.util.LinkedHashSet;

public class StringChallenge {

	public static void main(String[] args) {

		String input = "I am am Automation Tester Tester am tester";
		String lowerCase = input.toLowerCase();
		StringBuilder result = new StringBuilder();
		String[] words = lowerCase.split(" ");

		LinkedHashSet<String> set = new LinkedHashSet<>();

		for (String word : words) {
			set.add(word);
		}

		for (String word : set) {
			result.append(word).append(" ");
		}

		System.out.println(result);

	}

}
