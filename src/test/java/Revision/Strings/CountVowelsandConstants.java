package Revision.Strings;

public class CountVowelsandConstants {

	public static void main(String[] args) {

		String input = "SEnthilKUmar";
		int vowels = 0, constants = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				char lower = Character.toLowerCase(ch);
				if ("aeiou".indexOf(lower) != -1) {
					vowels++;
				} else {
					constants++;
				}
			}

		}

		System.out.println("Count of the Vowels: " + vowels);
		System.out.println("Count of the Constants: " + constants);
	}

}
