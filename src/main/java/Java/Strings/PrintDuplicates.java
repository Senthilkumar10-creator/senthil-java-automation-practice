package Java.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		String str = "RajaRajas";
		
		HashMap <Character , Integer> map = new LinkedHashMap <Character , Integer>();
		
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println("Duplicate values are: ");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
		
	}

}
