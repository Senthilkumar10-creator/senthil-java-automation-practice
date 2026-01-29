package Java.common;

import org.testng.annotations.Test;

public class JavaPrograms {

	// @Test
	public void starPattern() {

		int n = 5;

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

	// @Test
	public void factorial() {

		int n = 7;
		int factorial = 1;

		for (int i = 1; i <= n; i++) {

			factorial = factorial * i;

		}

		System.out.println("Factorial of " + n + " is: " + factorial);

	}

	@Test
	public void armStringNum() {

		int num = 153;
		int original = num;
		int res = 0;
		int digits = String.valueOf(num).length();
		
		 System.out.println(digits);

		while (num > 0) {

			int digit = num % 10;
			res += Math.pow(digit, digits);
			num = num / 10;

		}

		System.out.println(res);

		if (original == res) {
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("It is not an armstrong number");
		}

	}

}
