package Revision.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupinString {

	public static void main(String[] args) {
		String input = "I am Automation Tester";
		String[] lowerCase = input.toLowerCase().split(" ");

		StringBuilder result = new StringBuilder();
		for (String word : lowerCase) {

			Set<Character> set = new LinkedHashSet<>();

			for (char c : word.toCharArray()) {
				set.add(c);
			}

			for (char c : set) {
				result.append(c);
			}
			result.append(" ");
		}

		System.out.println(result.toString());

	}

}
