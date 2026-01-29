package Java.Strings;

import java.util.Scanner;

public class CountVowelsandConstants {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string:");
		String input = scanner.nextLine();
		String lowerCase = input.toLowerCase();
		
		int vowels = 0, constants =0 , digits = 0 , splChars = 0 , spaces =0 ;
		
		for (int i=0; i< lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			
			if(c>='a' && c<='z') {
				if("aeiou".indexOf(c) != -1) {
					vowels++;
				}else {
					constants++;
				}
			}else if(c>= '0' && c<='9') {
				digits++;
			}else if (c == ' ') {
				spaces++;
			}else {
				splChars++;
			}
		} 
		


        System.out.println("\n--- Character Counts ---");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + constants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + splChars);

        scanner.close();
	}

}
