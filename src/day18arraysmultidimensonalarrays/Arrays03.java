package day18arraysmultidimensonalarrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		/*
		 How to check if a specific element exists in an array or not
		 1)Use sort()
		 2)Then use binarySearch()
		 
		 */
		
		char crr[]= {'c', 'A', 'k', 'm'};
		
		//Check if 'x' exists in crr?
		
		//1.Step: Use sort()
		Arrays.sort(crr);
		System.out.println(crr);
		
		//2.Step:
		System.out.println(Arrays.binarySearch(crr, 'x')); //-5  if the char does not exist we will see negative number on the console. 
																//it means that if the char EXISTED, it would be in that place(not index order place). 
		
		System.out.println(Arrays.binarySearch(crr, 'e')); //-3
		
		System.out.println(Arrays.binarySearch(crr, 'Z')); //-2
		
		System.out.println(Arrays.binarySearch(crr, 'l')); //-4  
		
		System.out.println(Arrays.binarySearch(crr, 'c')); //1
	}

}
