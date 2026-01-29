package testPractice.again;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Practices {

	@Test
	public void countWords() {

		String input = "Big black bug bit a big black dog on his big black nose";

		int bigCount = 0;
		int blackCount = 0;
		int otherCount = 0;

		String[] words = input.split(" ");

		for (String word : words) {

			if (word.equalsIgnoreCase("Big")) {
				bigCount++;
			}
			if (word.equalsIgnoreCase("black")) {
				blackCount++;
			} else {
				otherCount++;
			}

		}

		System.out.println("big: " + bigCount);
		System.out.println("black: " + blackCount);

	}

	@Test
	public void anagram() {

		String input1 = "listen";
		String input2 = "silent";

		if (input1.length() != input2.length()) {
			System.out.println("Its not an Anagram");

		}

		char[] array1 = input1.toCharArray();
		char[] array2 = input2.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);

		if (Arrays.equals(array1, array2)) {
			System.out.println("Its an Anagram");
		} else {
			System.out.println("Its not an Anagram");
		}

	}

	@Test
	public void pairsOfSum() {

		int arr[] = { 4, 6, 9, 11, 14, 1, 3, 16, 8, 12, 7 };
		int target = 20;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + target);
				}
			}
		}

	}
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
