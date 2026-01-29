package testPractice.Strings;

public class ReverseStringwithholdPosition {

	public static void main(String[] args) {

		String input = "Senthil Kumar";
		String[] words = input.split(" ");
		String rev = "";

		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			rev = rev + " ";
		}

		System.out.println(rev);

	}

}
