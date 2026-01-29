package parcticess.StringsP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class StringPr {

	@Test
	public void reverseString() {

		String input = "Automation Testing";
		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}

		System.out.println(rev);

	}

	@Test
	public void reverseStringwithPosition() {

		String input = "Automation Testing";
		String rev = "";
		String[] words = input.split(" ");

		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			rev = rev + " ";
		}
		System.out.println(rev);

	}

	@Test
	public void reverseWords() {
		String input = "Automation Testing";
		String[] words = input.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
			if (words.length != 0) {
				System.out.print(" ");
			}
		}

	}

	@Test
	public void renDup() {

		String input = "automation";

		HashSet<Character> set = new LinkedHashSet<>();

		for (char c : input.toCharArray()) {
			set.add(c);
		}

		StringBuilder sb = new StringBuilder();

		for (char c : set) {
			sb.append(c);
		}

		System.out.println(sb.toString());

	}

	@Test
	public void printDup() {

		String input = "automation";

		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}

	@Test
	public void uniqDup() {

		String input = "automation";

		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}

	@Test
	public void countVowels() {

		String input = "aeiouzxcvb  12345";

		int vowels = 0, consta = 0, speChar = 0, spaces = 0, digits = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if ("aeiou".indexOf(ch) != -1) {
					vowels++;
				} else {
					consta++;
				}
			}
			if (ch >= '0' && ch <= '9') {
				digits++;
			}if (ch == ' ') {
				spaces++;
			}else {
				speChar++;
			}

		}
		
		System.out.println(vowels);
		System.out.println(consta);
		System.out.println(digits);
		System.out.println(spaces);
		System.out.println(speChar);

	}

}
