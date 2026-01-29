package testPractice.Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class MissingnuminArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,6,7,8};
		
		int n = 10;
		
		Map<Integer, Boolean> map = new LinkedHashMap<>();
		
		for(int num : a) {
			map.put(num, true);
		}
		
		for(int i =1; i <=n; i++) {
			if(!map.containsKey(i)) {
				System.out.println(i);
			}
		}
		
	}

}
