package testPractice.Strings;

public class CountVowelsCons {

	public static void main(String[] args) {

		String input = "Senthilkumar1234@#$%^  ";

		String lowerCase = input.toLowerCase();

		int vowels = 0, cons = 0, digits = 0, whitSpac = 0, sepchar = 0;

		for (int i = 0; i <= lowerCase.length() - 1; i++) {
			char c = lowerCase.charAt(i);

			if (c >= 'a' && c <= 'z') {
				if ("aeiou".indexOf(c) != -1) {
					vowels++;
				} else {
					cons++;
				}

			} else if (c == ' ') {
				whitSpac++;
			} else if (c >= '0' && c <= '9') {
				digits++;
			} else {
				sepchar++;
			}

		}

		System.out.println("vowels: " + vowels);
		System.out.println("cons: " + cons);
		System.out.println("digits: " + digits);
		System.out.println("whitSpac: " + whitSpac);
		System.out.println("sepchar: " + sepchar);

	}

}
