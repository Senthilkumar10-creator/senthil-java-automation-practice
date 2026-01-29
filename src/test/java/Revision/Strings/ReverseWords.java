package Revision.Strings;

public class ReverseWords {

	public static void main(String[] args) {

		String input = "Thalapathy Vijay";
		String[] words = input.split(" ");
		String rev = "";

		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			rev = rev + " ";
		}

		//System.out.println(rev);

		String[] split = rev.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i]);
			if (split.length > 0) {
				System.out.print(" ");
			}
		}

	}

}
