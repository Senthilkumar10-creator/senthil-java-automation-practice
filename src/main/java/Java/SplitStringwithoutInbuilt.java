package Java;

public class SplitStringwithoutInbuilt {

	public static void main(String[] args) {

		String input = "afrwveben12345r@$%#^#*";
		StringBuilder numbers = new StringBuilder();
		StringBuilder letters = new StringBuilder();
		StringBuilder splChars = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (ch >= '0' && ch <= '9') {
				numbers.append(ch);
			} else if (ch >= 'a' && ch <= 'z') {
				letters.append(ch);
			} else if (ch >= 'A' && ch <= 'Z') {
				letters.append(ch);
			} else {
				splChars.append(ch);
			}

		}

		System.out.println("Numbers: " + numbers);
		System.out.println("Letters: " + letters);
		System.out.println("Splchars: " + splChars);

	}

};