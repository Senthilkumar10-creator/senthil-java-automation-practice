package testPractice.Practices;

public class Primenumfrom1to100 {

	public static void main(String[] args) {

		for (int num = 2; num <= 100; num++) {

			Boolean isprime = true;

			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}

			if (isprime) {
				System.out.print(num + " ");
			}
		}

	}

}
