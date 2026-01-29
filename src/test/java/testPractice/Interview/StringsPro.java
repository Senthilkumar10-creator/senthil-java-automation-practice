package testPractice.Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class StringsPro {

	@Test
	public void revereseString() {

		String input = "Automation Testing";
		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
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
	public void reversewithPosition() {

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
	public void remDupString() {
		String input = "automation";

		HashSet<Character> set = new LinkedHashSet<Character>();

		for (char c : input.toCharArray()) {
			set.add(c);
		}

		StringBuilder result = new StringBuilder();

		for (char c : set) {
			result.append(c);
		}

		System.out.println(result);

	}

	@Test
	public void printOnlyDup() {
		String input = "automation";

		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println("Duplicate elements: ");

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}

		}

	}

	@Test
	public void printUniqueElements() {
		String input = "automation";

		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println("Duplicate elements: ");

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}

		}

	}

	@Test
	public void countVowelsConstants() {

		String input = "aeioudfghlazxcvb";
		int vowels = 0, constants = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (("aeiou").indexOf(ch) != -1) {
					vowels++;
				} else {
					constants++;
				}
			}
		}
		System.out.println("vowels: " + vowels);
		System.out.println("constants: " + constants);

	}

	@Test
	public void printVowelsConstants() {

		String input = "aeioudfghlazxcvb";
		StringBuilder vowles = new StringBuilder();
		StringBuilder constants = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if ("aeiou".indexOf(ch) != -1) {
					vowles.append(ch);
				} else {
					constants.append(ch);
				}
			}

		}

		System.out.println("vowels: " + vowles);
		System.out.println("constants: " + constants);

	}

	@Test
	public void checkAnagram() {

		String input1 = "silent";
		String input2 = "lister";

		if (input1.length() == input2.length()) {

			char[] arr1 = input1.toCharArray();
			char[] arr2 = input2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if (Arrays.equals(arr1, arr2)) {
				System.out.println("Its anagram");
			} else {
				System.out.println("Its not an anagram");
			}

		} else {
			System.out.println("Its not an anagram");
		}

	}

}
