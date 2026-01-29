package testPractice.Arrays;

import java.util.Arrays;

public class SecondSmallandLarge {

	public static void main(String[] args) {
		
		int a[] = { 5, 2, 8, 9, 18, 19, 8, 3 };
		
		Arrays.sort(a);
		int small = a[0];
		int large = a[a.length-1];
		Integer secSmall = null;
		Integer secLarge = null;
		
		
        for(int i = a.length-1; i>=0; i--) {
        	if(a[i] < large) {
        		secLarge = a[i];
        		break;
        	}
        }
		
		for(int num : a) {
			if(num > small) {
				secSmall = num;
				break;
			}
		}
		
		System.out.println("Second largest:" + secLarge);
		System.out.println("Second Smallest:" + secSmall);
		
		
	}

}
