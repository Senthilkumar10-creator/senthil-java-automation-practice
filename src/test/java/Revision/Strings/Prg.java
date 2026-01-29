package Revision.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Prg {

	public static void main(String[] args) {

		String str = "I am am Automation Tester Tester am Tester";
		String[] words = str.split(" ");
		Set<String> set = new LinkedHashSet<>();
		for (String word : words) {
			set.add(word);
		}
		for (String out : set) {
			System.out.print(out + " ");
		}
	}

}
