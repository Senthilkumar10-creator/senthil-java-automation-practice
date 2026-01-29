package Revision.Strings;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 12121;
		int original = number;
		int rev = 0;

		while (number > 0) {
			int digit = number % 10;
			rev = (rev * 10) + digit;
			number = number / 10;
		}

		if (original == rev) {
			System.out.println("Its Palindrome");
		} else {
			System.out.println("Its not an Palindrome");
		}

	}

}
