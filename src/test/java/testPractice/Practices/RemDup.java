package testPractice.Practices;

public class RemDup {

	public static void main(String[] args) {

		int arr[] = { 1,3,4,5,5,6,7,7,8,8,9,9,0 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}}}
