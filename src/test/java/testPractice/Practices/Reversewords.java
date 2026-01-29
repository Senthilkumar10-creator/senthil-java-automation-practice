package testPractice.Practices;

public class Reversewords {

	public static void main(String[] args) {

		String input = "java is program";
		String[] split = input.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i]);
			if (input.length() > 0) {
				System.out.print(" ");
			}
		}

	}

}
