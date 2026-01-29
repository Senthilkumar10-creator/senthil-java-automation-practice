package Java.Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDup {

	public static void main(String[] args) {
		
		String str = "RajaRaja";
		
		HashSet <Character> set = new LinkedHashSet <Character>();
		
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		
		StringBuilder result = new StringBuilder();
		
		for(char c : set) {
			result.append(c);
		}
		
		System.out.println(result.toString());

	}

}
