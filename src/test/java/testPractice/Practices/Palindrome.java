package testPractice.Practices;

public class Palindrome {

	public static void main(String[] args) {

		String input = "SENTHIL";
		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}

		if (rev.equals(input)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not an Palindrome");
		}

	}

}

