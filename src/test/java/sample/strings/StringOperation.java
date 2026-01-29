package sample.strings;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class StringOperation {

	@Test
	public void regxOperation() {

		/*
		 * String str = "madam123";
		 * 
		 * String replaceAll = str.replaceAll("[^a-zA-Z ]", "");
		 * System.out.println(replaceAll);
		 * 
		 * String replaceAll2 = str.replaceAll("[^0-9]", "");
		 * System.out.println(replaceAll2);
		 */

		String[] input = { "happyabc", "sadabc", "enjoyabc", "runABCfast" };
		List<String> result = new ArrayList<String>();

		for (String word : input) {
			String output = word.replaceAll("(?i)abc", "");
			result.add(output);
		}

		System.out.println(result);

	}

	@Test
	public void reverseWord() {
		String input = "Hello Raja Saab";

		String[] words = input.split(" ");

		System.out.println("Output: ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
			if (i != 0)
				System.out.print(" ");

		}

	}
	
	@Test
	public void lowerandUpperCase() {
		
		String input = "auTOmaTIOn";
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();
		
		for(char c : input.toCharArray()) {
			if(Character.isLowerCase(c)) {
				lowerCase.append(c);
			}else {
				upperCase.append(c);
			
		}
		
		
		
		System.out.println("Lowercase: " + lowerCase.toString());
		System.out.println("Uppercase: " + upperCase.toString());
	}
	
	
	}	
	

}
