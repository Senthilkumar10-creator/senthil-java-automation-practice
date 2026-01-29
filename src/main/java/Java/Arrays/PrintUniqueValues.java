package Java.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PrintUniqueValues {

	public static void main(String[] args) {
		
		int a[] = {10, 20 ,30, 30, 40 ,40 ,50 ,60};
		
		HashMap <Integer, Integer> map = new LinkedHashMap<>();
		
		for (int num : a) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		System.out.println("Unique values: ");
		for(int num : a) {
			if(map.get(num) == 1) {
				System.out.print(num + " ");
			}
		}

	}

}
