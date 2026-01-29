package testPractice.Interview;

import org.testng.annotations.Test;

public class JavaPro {

	@Test
	public void prime() {

		int n = 16;
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
	public void prime1to100() {

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
    public void Fibonci() {
		
		int n = 8;
		int first =0, second = 1;
		
		for(int i=0 ; i<=n ;i++) {
			System.out.print(first + " ");
			int third = first + second;
			first = second;
			second = third;
		}
		
		
		
	}

}
