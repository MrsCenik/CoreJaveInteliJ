  package day19arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class List01 {

	public static void main(String[] args) {
		

	// ArrayLists are flexible with their size
	// ArrayLists cannot store multiple data type
	// ArrayLists store non primitive data type
	
		
		
	//How to create a list
	// 1.Way:
	
		
	ArrayList<Integer> list= new ArrayList<>();		
	
	// To print the list on the console : just place the name of the list in the Sytem.out.println()
	
	System.out.println(list); //[]
	
	//How to add elements into a list
	
	 list.add(12);
	 list.add(5);
	 list.add(30);
	 list.add(0, 8); // we put the 8 in the index 0(at the beginning of the arrayList) 

	 
	 System.out.println(list); //[8, 12, 5, 30]
	 
	 Collections.sort(list); //We use collections to sort in ascending order
	
	 System.out.println(list); //[5, 8, 12,30]
	 
	 //How to get a specific element from list
	 System.out.println(list.get(2)); //12
	// System.out.println(list.get(4)); //out of bounds exception.  
	 
	 list.add(25);
	 list.add(45);
	 list.add(19);
	 list.add(-5);
	 list.add(128);
	 
	 System.out.println(list);
	 
	 
	 /*
	  Type a code to find and print the min and max elements from the list 1.
	  */
		
	 Collections.sort(list);
	 System.out.println(list);
	 int min = list.get(0);
	 int max = list.get(list.size()-1);
	 System.out.println("min value of the list: " + min);
	 System.out.println("max value of the list: " + max);
	
	 System.out.println("min element of the list: "+list.get(0));
	 System.out.println("max element of the list: "+list.get(8));

	 //How to check if the list is empty or not
	 System.out.println(list.isEmpty()); //False
	 
	 ArrayList<String>list2= new ArrayList<>();
	 System.out.println(list2.isEmpty()); //True
	 
	 
	  // How to remove elements from a list
	 //by index
	 
	 System.out.println(list); //[-5, 5, 8, 12, 19, 25, 30, 45, 128]
	 list.remove(5);	
	 System.out.println(list); // removed 25 because it was in index 5. [-5, 5, 8, 12, 19, 30, 45, 128]
	 System.out.println(list.remove(5)); // removed 30 and return what it removed =>30
	 System.out.println(list); //[-5, 5, 8, 12, 19, 45, 128]

	list.remove(list.indexOf(5)); //remove specifically '5'
	System.out.println(list); //[-5, 8, 12, 19, 45, 128]
    
	list2.add("Ali");
	list2.add("Veli");
	list2.add("Jhon");
	list2.add("Ayse");
	list2.add("Can");
	
	System.out.println(list2); //[Ali, Veli, Jhon, Ayse, Can]
	
	//list.remove(list2.remove("Ali"));
	
	System.out.println(list2); //[Veli, Jhon, Ayse, Can]
	
	 
	 
	}
}
