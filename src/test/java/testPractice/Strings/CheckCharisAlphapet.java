package testPractice.Strings;

import java.util.Scanner;

public class CheckCharisAlphapet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character: ");
		char c = sc.next().charAt(0);

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is an Alphapet");
		} else {
			System.out.println(c + " is not an Alphapet");
		}

		sc.close();

	}

}
