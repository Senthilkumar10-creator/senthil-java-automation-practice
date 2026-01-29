package Java.Arrays;

import java.util.Arrays;

public class SecondLarandSecondSmall {

	public static void main(String[] args) {
		
		int a[] = {10, 20 ,30, 30, 40 ,40 ,60 ,70 ,50};
		
		Arrays.sort(a);
		
		int small = a[0];
		int large = a[a.length-1];
		Integer SecLarge = null , secSmall = null;
		
		for (int i = a.length-1;i>=0; i--) {
			if(a[i] < large) {
				SecLarge = a[i];
				break;
			}
		}
		
		for (int num : a) {
			if(num > small) {
				secSmall = num;
				break;
			}
		}
		
		
		System.out.println("Second largest num: " + (SecLarge!=null?SecLarge:"None"));
		System.out.println("Second smallest num: " + (secSmall!=null?secSmall:"None"));
		

	}

}
