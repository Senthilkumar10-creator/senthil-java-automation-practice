package sample.practices;

import org.testng.annotations.Test;

public class Prac1 {

	@Test
	public void printprime() {

		for (int n = 2; n <= 100; n++) {

			boolean isprime = true;

			for (int i = 2; i <= Math.sqrt(n); i++) {

				if (n % i == 0) {
					isprime = false;
					break;

				}
			}
			if (isprime) {
				System.out.print(n + " ");
			}

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
