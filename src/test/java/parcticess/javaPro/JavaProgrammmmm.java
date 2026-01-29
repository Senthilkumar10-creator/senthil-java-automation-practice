package parcticess.javaPro;

import org.testng.annotations.Test;

public class JavaProgrammmmm {

	@Test
	public void prime() {

		int n = 4;
		int count = 0;

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
		}

		if (count == 2) {
			System.out.println("Its prime");
		} else {
			System.out.println("Its not prime");
		}

	}

	@Test
	public void printprime1to100() {

		for (int n = 2; n <= 100; n++) {

			boolean prime = true;

			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					prime = false;

				}
			}

			if (prime) {
				System.out.print(n + " ");
			}
		}

	}

	@Test
	public void fibinocci() {

		int n = 10;
		int first = 0, second = 1;

		for (int i = 0; i <= n; i++) {
			System.out.print(first + " ");
			int third = first + second;
			first = second;
			second = third;
		}

	}

	@Test
	public void factorial() {

		int n = 4;
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println(fact);

	}

	@Test
	public void leapyear() {

		int year = 2014;

		if ((year % 4 == 0) || (year % 400 == 0 && year % 100 != 0)) {
			System.out.println("Its leap year");
		} else {
			System.out.println("Its not  leap year");
		}

	}

	@Test
	public void reverseNum() {
		int num = 12121;
		int original = num;
		int rev = 0;

		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}

		System.out.println(rev);
		
		if(rev==original) {
			System.out.println("Its Palindrome Number");
		}else {
			System.out.println("Its not Palindrome Number");
		}

	}

	@Test
	public void swapTwoNum() {

		int a = 10;
		int b = 15;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
