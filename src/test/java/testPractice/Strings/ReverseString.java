package testPractice.Strings;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Senthil Kumar";
		String res = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			res = res + input.charAt(i);
		}

		System.out.println(res);
	}

}
