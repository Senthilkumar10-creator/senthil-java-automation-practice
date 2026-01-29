package testPractice.Interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringPrograms {

	public static void main(String[] args) {

		String input = "Senthil";

		int[] count = new int[256];

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			count[ch]++;
		}
		char res = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (count[ch] == 1) {
				res = ch;
				break;
			}
		}

		if (res != 0) {
			System.out.println(res);
		}

	}

}
