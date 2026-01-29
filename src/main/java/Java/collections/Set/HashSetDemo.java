package Java.collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<Object> (Arrays.asList(10,"Sachin",'A',100.0, true));
		System.out.println(set);
		
		//To get the length of the set
		System.out.println("length of the set: " + set.size());
		
		//Add a new value to the set
		set.add("Indian");
		set.add("Sachin");// Duplicate value
		System.out.println(set);
		
		//To check the element is present or not
		System.out.println(set.contains("Sachin"));
		
		//To print all the values from the set
		
		System.out.println("All the values from set using For-each loop:");
		for (Object e : set) {
			System.out.println(e);
		}
		
		System.out.println("All the values from set using Iterator:");	
             Iterator<Object> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		
	}

}
