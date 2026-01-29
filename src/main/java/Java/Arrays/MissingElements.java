package Java.Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MissingElements {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,6,8,9};
		
		int n= 10;
		
		HashMap <Integer , Boolean> map = new LinkedHashMap<>();
		
		for (int num : a) {
			map.put(num, true);
		}

		for (int i =1 ; i<n ;i++) {
			if(!map.containsKey(i)) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
