package testPractice.Interview;

import java.util.Scanner;

import org.testng.annotations.Test;

public class JavaPrograms {

	@Test
	public void prime() {

		int n = 13;
		int count = 0;

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
		}

		if (count == 2) {
			System.out.println("Its Prime");
		} else {
			System.out.println("Its not Prime");
		}

	}

	@Test
	public void primeFrom1to100() {

		for (int n = 2; n <= 100; n++) {
			boolean prime = true;

			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.print(n + " ");
			}
		}

	}

	@Test
	public void leapYear() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		// int year = 2023;

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Leap");
		} else {
			System.out.println("Not a leap");
		}

	}

	@Test
	public void reverseNum() {

		int num = 12123;
		int original = num;
		int rev = 0;

		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println(rev);

	}

	@Test
	public void fibinoci() {
		int n = 7;
		int first = 0, second = 1;

		for (int i = 0; i <= n; i++) {
			System.out.print(first + " ");
			int third = first + second;
			first = second;
			second = third;
		}

	}

	@Test
	public void sumOfDigits() {
		String input = "aswerv12345";
		int sum = 0;
		String replaceAll = input.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);

		for (int i = 0; i < replaceAll.length(); i++) {
			char ch = replaceAll.charAt(i);
			sum = sum + ch - '0';

		}

		System.out.println(sum);

	}

}
