package testPractice.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDupInString {

	public static void main(String[] args) {
		
		String input = "I am Automation tester";
		String lowercase = input.replaceAll("\\s+", "").toLowerCase();
		System.out.println(lowercase);
		
		HashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		
		for(char c : lowercase.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet() ) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}

}
