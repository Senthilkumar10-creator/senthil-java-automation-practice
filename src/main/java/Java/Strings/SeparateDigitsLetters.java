package Java.Strings;

public class SeparateDigitsLetters {

	public static void main(String[] args) {
		
		String srt = "Senthil  1234!@##";
		int letters = 0 , digits = 0 , specChars = 0 , whiteSpaces = 0;
		
		for (char c :srt.toCharArray()) {
			if(Character.isLetter(c)) {
				letters++;
			}else if(Character.isDigit(c)) {
				digits++;
			}else if(Character.isWhitespace(c)) {
				whiteSpaces++;
			}else {
				specChars++;
			}
		}
		
		
		System.out.println("Letters: " +letters);
		System.out.println("Digits: " + digits);
		System.out.println("Spaces: " + whiteSpaces);
		System.out.println("Special Charcs: " + specChars);
		
		
	}

}
