package Revision.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintonlyDupinStrings {

	public static void main(String[] args) {

		String input = "Automation";
		String lowerCase = input.toLowerCase();

		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char c : lowerCase.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println("Duplicate values are: ");

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}

}
