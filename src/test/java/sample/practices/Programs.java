package sample.practices;

import org.testng.annotations.Test;

public class Programs {

	@Test
	public void reverseWordswithPos() {

		String input = "Senthil Kumar";
		String rev = "";
		String words[] = input.split(" ");

		for (String word : words) {

			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			rev = rev + " ";
		}
		System.out.println(rev.trim());

	}

	@Test
	public void addWords() {
		String input1 = "Senthil";
		String input2 = "Kumar";

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < Math.max(input1.length() - 1, input2.length() - 1); i++) {

			if (i < input1.length()) {
				char c = input1.charAt(i);
				output.append(c);
			}

			if (i < input2.length()) {
				char d = input2.charAt(i);
				output.append(d);
			}
		}

		System.out.println(output.toString().trim());

	}

	@Test
	public void spliStrings() {

		String input = "hiJava787&^ghyt";

		String letters = input.replaceAll("[^a-zA-Z]", "");
		String numbers = input.replaceAll("[^0-9]", "");
		String splChars = input.replaceAll("[a-zA-Z0-9]", "");

		System.out.println("Letters: " + letters);
		System.out.println("Numbers: " + numbers);
		System.out.println("SplChars: " + splChars);

	}

	@Test
	public void reverseString() {
		String input = "Hello";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println(reversed);
	}

	@Test
	public void reverseWords() {

		String input = "Hi I am    Senthil";
		String[] words = input.split("\\s+");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
			if (i != 0)
				System.out.print(" ");
		}

	}

	@Test
	public void reverseWordswithPosition() {

		String input = "Senthil Kumar";
		String[] words = input.split("\\s+");

		StringBuilder result = new StringBuilder();

		for (int i = 0; i <= words.length - 1; i++) {
			result.append(new StringBuilder(words[i]).reverse().toString());

			if (i < words.length) {
				result.append(" ");
			}
		}

		System.out.println(result.toString());
	}

	@Test
	public void primeNum() {

		int num = 9;

		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
		}

		if (count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not an prime");
		}

	}

	@Test
	public void primeNum1to100() {

		System.out.println("Prime numbers from 1 to 100:");

		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;

			for (int i = 2; i <=Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(num + " ");
			}

		}

	}
	
	@Test
	public void fibonci() {
		int n= 7;
		int first = 0 , second =1;
		
		for (int i = 0 ; i<=n; i++) {
			System.out.print(first + " ");
			int third = first + second;
			first = second;
			second = third;
		}	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
