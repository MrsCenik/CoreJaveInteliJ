package day31iteratorcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Can");
		list1.add("Aliye");
		list1.add("Canan");
		System.out.println(list1); //[Ali, Can, Aliye, Canan]
		
		for(String w: list1) {
			w = w + "!";
			
		}
		//By using for loop we are not able to change the collection elements. 
		System.out.println(list1); //[Ali, Can, Aliye, Canan]
		
		
							//Use Iterator
		//How to update list by using ListIterator
		ListIterator<String> list1itr = list1.listIterator(); // [ __   Ali, Can, Aliye, Canan]
		
		while(list1itr.hasNext()) {
			
			String element = list1itr.next();
			list1itr.set(element+"!");
			
		}
		System.out.println(list1); //[Ali!, Can!, Aliye!, Canan!]
		
		List<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Samsung");
		list2.add("Huavei");
		
		//Update all elements and print them in reverse order
		
		ListIterator<String> list2Itr = list2.listIterator(); 
		
		//To move the pointer to the end use "hasNext()" and "next()"
		while(list2Itr.hasNext()) {
			list2Itr.next();
		}
		//When we use "hasPrevious()" and "previous()" methods, you will be able to work with the list element
		while(list2Itr.hasPrevious()) {
			String element = list2Itr.previous();
			list2Itr.set(element+"?");
			
		}
		Collections.reverse(list2);
		System.out.println(list2);
		
		//How to remove all elements by using ListIterator
		List<String> list3 = new ArrayList<>();
		list3.add("A");
		list3.add("C");
		list3.add("B");
		ListIterator<String> list3Itr = list3.listIterator(); //[A, B, C] //Before removing: [A, C, B]
		System.out.println("Before removing: "+ list3);
		//If you use remove method without using next method you will get "IllegalStateException"
		while(list3Itr.hasNext()) {
			list3Itr.next();
			list3Itr.remove();
		}
		System.out.println("After removing: "+ list3);//After removing: []
		
		//How to ass elements into a list by using ListIterator
		List<String> list4 = new ArrayList<>();
		list4.add("X");
		list4.add("Y");
		list4.add("Z");
		ListIterator<String> list4Itr = list4.listIterator();
		
		//If you use while loop like below, elements will be added to the end, if you do not use 
		//while loop elements will be added to beginning of the list.
		while(list4Itr.hasNext()) {
			list4Itr.next();
		}
		list4Itr.add("T");
		list4Itr.add("U");
		list4Itr.add("V");
		System.out.println(list4); //[X, Y, Z, T, U, V]
		
		
		//Differences between Iterator and listIterator
		
		List<String> list5 = new ArrayList<>();
		list5.add("AB");
		list5.add("CD");
		list5.add("EF");
		
		Iterator<String> list5Itr = list5.iterator();
		//In Iterator,  there is no hasPrevious(), and previous() methods, because of that it is one-directional
        //In Iterator, there is no add() method, so we cannot add new elements by using Iterator
		//In Iterator, there is no set() method, so we cannot modify the elements by using Iterator
		//In Iterator and in listIterator, there is remove() method.
		//Iterator can be used in other Collections(Map, Set, List), but ListIterator can be used just in Lists.
		while(list5Itr.hasNext()){
			list5Itr.next();	
		}	
	}	
}
