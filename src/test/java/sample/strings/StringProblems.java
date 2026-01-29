package sample.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class StringProblems {
	
	@Test
	public void remDup() {
		
		String input = "Raja Raja Raja";
		String replaceAll = input.replaceAll("\\s+", "");
		System.out.println(replaceAll);
		
		HashSet <Character> set = new LinkedHashSet<>();
		
		for(char c : replaceAll.toCharArray()) {
			set.add(c);
			
		}
		
		StringBuilder output = new StringBuilder();
		for (char c : set) {
			output.append(c);
		}
		
		System.out.println(output.toString());
		
		
	}
	
	@Test
	public void printDup() {
		
		String input = "Senthil kumar kum";
		String replaceAll = input.replaceAll("\\s+", "");
		//System.out.println(replaceAll);
		
		
		HashMap <Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : replaceAll.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		System.out.println("Dupliate values: ");
		for (Map.Entry <Character, Integer> entry : map.entrySet()    ) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}		
		 
	}
	
	
     @Test
	public void reverseStringwithposition() {
		
		String input = "Senthil Kumar";
		
		String[] words = input.split(" ");
		
		String rev = " ";
		
		for (String word : words) {
			
			for(int i = word.length()-1; i>=0 ; i--) {
				
				rev = rev + word.charAt(i);
				
			}
			
			rev = rev + " ";
		}
		
		System.out.println(rev.toString().trim());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
