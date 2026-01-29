package testPractice.Interview;

import java.util.Arrays;

import org.testng.Assert;

public class Anagram {

	public static void main(String[] args) {

 String input1 = "listen";
 String input2 = "sdfrty";
 
 if(input1.length()!=input2.length()) {
	 System.out.println("ITS NOT AN ANAGRAM - LENGTH");
	 return;
 }
		
	char[] array1 = input1.toCharArray();
	char[] array2 = input2.toCharArray();
	
	Arrays.sort(array1);
	Arrays.sort(array2);
	
	if(Arrays.equals(array1, array2)) {
		System.out.println("ITS AN ANAGRAM");
	}else {
		System.out.println("ITS NOT AN ANAGRAM");
	}
 
 
 
 
 
 
 
		

	}

}
