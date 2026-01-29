package Java.Strings;

public class SplitDigitsLettersSplChars {

	public static void main(String[] args) {
		
		String str = "Senthilkumar     @@#$%%^&2345";
		
		String numbers = str.replaceAll("[^0-9\\s+]", " ");
		System.out.println("Numbers: " + numbers.trim());
		
		
		String letters = str.replaceAll("[^a-zA-Z\\s+]", "");
		System.out.println("Letters: " + letters.trim());
		
		String splChars = str.replaceAll("[a-zA-Z0-9\\s+]", "");
		System.out.println("Special Chars: " + splChars.trim());
		

	}

}
