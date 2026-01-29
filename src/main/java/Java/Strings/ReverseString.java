package Java.Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String original = "Madam";
		String rev = "";
		String lowerCase = original.toLowerCase();
		
		for (int i = lowerCase.length()-1; i>=0 ; i--) {
			rev = rev + lowerCase.charAt(i);
		}
		
		System.out.println(rev);
		
		if(lowerCase.equals(rev)){
			System.out.println("Its Palindrome");
		}
		else {
			System.out.println("Not an Palindrome");
		}
	}

}
