package Java.collections.List;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList <Object> list = new LinkedList <Object> (Arrays.asList("Rohit", 264, 'A' , true , 100.0));
		
		//LinkedList special methods
		// addFirst(), addLast(), getFirst(), getLast(), removeFirst(), removeLast()
		
		System.out.println(list);
		
		list.addFirst("India");
		list.addLast("Mumbai");
		
		System.out.println("After adding values: " + list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println("After removing values: " + list);
	}

}
