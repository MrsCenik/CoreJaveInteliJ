package ReplitQuestions;

import java.util.Arrays;

public class BilalsAnswer {
	
	public static void main(String[] args) {
			
			System.out.println(convertToArray("John"));
			
	    }
 	static String convertToArray(String name) {
 		char[] arr=new char[name.length()];
 		for(int i=0; i<name.length(); i++) {
 			arr[i]=name.charAt(i);	 			
 		}	
 		return Arrays.toString(arr);	 
 				
	 }
}