package Java.collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList <Object> myList = new ArrayList<Object>(Arrays.asList("Rohit",'A',264 , true));
	    
		//To Print the list values
		System.out.println(myList);
	    
		//To get the length of the List
		System.out.println("Size of the List: " + myList.size());
		
		//To retrieve the value from the List
	    System.out.println(myList.get(0));
	    
	    //To insert the new value in the existing List
	    myList.add(2, "Right hand Batsman");
	    System.out.println(myList);
	    
	    //To modify or change the value from the list
	    myList.set(0, "Rohit Sharma");
	   
	    //To check the element is present or not
		System.out.println(myList.contains(264));
				
		//To print all the values from the List
		System.out.println("All the values from List using For loop:");
		for (int i = 0; i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		System.out.println("All the values from List using For-each loop:");
		for (Object e : myList) {
			System.out.println(e);
		}
		
		System.out.println("All the values from List using Iterator:");		
		Iterator<Object> it = myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
