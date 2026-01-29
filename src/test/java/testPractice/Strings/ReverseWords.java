package testPractice.Strings;

public class ReverseWords {

	public static void main(String[] args) {

		String input = " I am Automation Tester";
		String[] words = input.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
			if (words.length != 0) {
				System.out.print(" ");
			}

		}

	}

}
