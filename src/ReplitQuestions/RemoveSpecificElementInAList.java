package ReplitQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSpecificElementInAList {
		/*
		 write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array
		
		Input :{1,2,3,4,5,6} 
		
		element:6
		
		Output : [1,2,3,4,5]
		 */
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("1","2","3","4","5","6"));
		list1.remove(list1.size()-1);
		System.out.println(list1);
	}

}
