package day20arrayliss;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		List<Integer> list1= new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(25);
		list1.add(505);
		list1.add(21);
		list1.add(57);
		
		List<Integer> list2= new ArrayList<>();
		list2.add(147);
		list2.add(5);
		list2.add(600);
		list2.add(404);
		list2.add(202);
		list2.add(888);
		
		//How to join two lists
		//addAll==>all of the elements on the specified collection to the end of this list
		//Returns true of this list changed as a result of the call. 
		System.out.println(list1.addAll(list2)); //true
		
		
		System.out.println(list1); //updated
		System.out.println(list2); //not updated

		//How to delete all elements from a list
		
		System.out.println("Removed list2: "+list1.removeAll(list2)); //true
		
		/*
		 CLEAR: removes all of the elements from this list (Optional operation)
		 	The list will be empty this call returns
		 */
		list1.clear(); //[]
		System.out.println(list1);
	}
}
