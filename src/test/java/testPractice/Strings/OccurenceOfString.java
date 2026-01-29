package testPractice.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfString {

	public static void main(String[] args) {

		String input = "I am Automation Tester";
		String replace = input.replaceAll("\\s+", "");

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : replace.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
