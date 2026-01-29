package sample.strings;

public class RemDuplicates {

	public static void main(String[] args) {

		String str = "II AAMM AAUUttooMMAATTIIOONN TTEESSSTTeerr";
		StringBuilder output = new StringBuilder();
		char prev = 0;

		for (String word : str.split(" ")) {

			StringBuilder cleanWord = new StringBuilder();

			for (char c : word.toCharArray()) {

				if (c != prev) {
					cleanWord.append(c);
					prev = c;
				}

			}

			output.append(cleanWord).append(" ");

		}

		System.out.println(output.toString());

	}

}
