package day19arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List03 {

	public static void main(String[] args) {
		
		//2.way to create a list
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		
		System.out.println(list.contains("A")); // True ==> If this list contains the specified element it returns 'true'
		System.out.println(list.contains("X")); //False
		
		System.out.println(list.equals(list1)); //True ==> If the specified object is equal to this list
		
		/*
		 Ask user to enter a letter
		 If the letter exists in list1 convert it to "Got it"
		 otherwise add the element which user entered in the list1
		 */

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a letter");
		String letter=scanner.next().toUpperCase().substring(0,1);
		
		if(list1.contains(letter)) {
			list1.set(list1.indexOf(letter),"Got it");
			System.out.println(list1);
			
		}else {
			list1.add(letter);
		
		System.out.println(list1);
		
		}
		scanner.close();
	}

}
