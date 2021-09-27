 package practice_class06;

import java.util.Arrays;

public class AnagramMethod {
	/*
    7. Write a method that checks to see if the words u pass is Anagram. 
    EX: read and dear  --> true (interview question)

 */
	public static boolean isAnagram(String str1, String str2) {
		
		//toCharArray
		//split()
		
		String [] arr1=str1.split("");
		String [] arr2=str2.split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1,arr2);
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("read", "dear"));
		
	}

}
