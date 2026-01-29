package Java.Strings;

import java.util.*;


public class OccurenceOfString {

	public static void main(String[] args) {
		
		String str = "Automation";
		
		HashMap <Character, Integer> map = new LinkedHashMap<>();
		
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry <Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue() );
		}
		

	}

}
