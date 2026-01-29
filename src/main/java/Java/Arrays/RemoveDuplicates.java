package Java.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int a[] = {10, 20 ,30,30,40,40,50,60};
		
		System.out.println("Before removing duplicates: " + Arrays.toString(a));
		
		HashSet <Integer> set = new LinkedHashSet<Integer> ();
		
		for(int num : a) {
			set.add(num);
		}
     System.out.println("After removing duplicates: " + set);
	}

}
