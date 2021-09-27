package day34maps;

import java.util.Hashtable;

public class HashTable01 {
	
	 /*
	  
	 	1)Hashtable is tread-safe and synchronize
	 	2)Hashtable does not put the element in any order.
	 	3)Hashtable does not allow us to use "null" in keys and in values. 
	 	4)Hashtable works with being thread-safe and synchronization, and checking to be null,
	 	  because of that it is slower than HashMap
	 	
	
	  */

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		
		ht1.put(100, "Ali");
		ht1.put(101, "Veli");
		ht1.put(102, "Can");
//		ht1.put(null, "XXX"); // Throws NullPointerException
//		ht1.put(103, null); //Throws NullPointerException
		System.out.println(ht1);

	}

}
