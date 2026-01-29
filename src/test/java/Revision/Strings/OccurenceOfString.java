package Revision.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfString {

	public static void main(String[] args) {

		String input = "SenthilKumarS";

		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println("Occurence of String: ");

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}

	}

}
