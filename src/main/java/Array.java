import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		int a[]= {10 , 20, -30 ,-40};
		
		ArrayList <Integer> list1 = new ArrayList<>();
		ArrayList <Integer> list2 = new ArrayList<>();
		
		
		for(int num : a) {
			if (num > 0) {
				list1.add(num);
			}else {
				list2.add(num);
			}
		}
		
		System.out.println("Positive Array: " + list1);
		System.out.println("Negative Array: " + list2);

	}

}
