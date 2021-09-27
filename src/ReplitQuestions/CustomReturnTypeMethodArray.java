package ReplitQuestions;

import java.util.Arrays;

public class CustomReturnTypeMethodArray {
	/*
	 Create a custom return type method accepts a name as parameter and prints the name as a char array. 

		(do not use toCharArray() method)
		
		
		Input : John
		
		Output :[J, o, h, n]
	 */
	
	public static char[] stringToArray(String name) {
		
		char[] nameArray=new char[name.length()];
		for(int i=0; i<name.length(); i++) {
			nameArray[i]= name.charAt(i);	
		}
		return nameArray;		
	}
	public static void main(String[] args) {
		String name="John";
		System.out.println(Arrays.toString(stringToArray(name)));
	}
}