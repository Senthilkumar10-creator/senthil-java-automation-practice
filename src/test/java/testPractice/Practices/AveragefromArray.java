package testPractice.Practices;

public class AveragefromArray {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 5, 6, 7, 8, 9 };
		double sum = 0;
		int length = a.length - 1;

		for (int num : a) {
			sum = sum + num;
		}

		System.out.println(sum);

		double avreage = sum / length;

		System.out.printf("Average: %.2f%n", avreage);

	}

}
