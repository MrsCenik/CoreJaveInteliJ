package day07stringmanipulations;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		/*
		 1- equals() ==> compare the Strings with cases returns boolean
		 2- equalsIgnoreCase() ==> Compare the Strings without cases and it returns boolean
		 3- length() ==> the counts(size) of in a string and it returns integer 
		 
		
		 */
		String str1 = "";
		System.out.println(str1.length()); //0 ==>for empty Strings the length() returns 0
	
		String str2 = " ";
		System.out.println(str2.length()); //1 ==> in the String there is a space and it is like a character
		
		//String str3 = null;
		//System.out.println(str3.length()); //NullPointerException ==> Do not use length for null.
		
		
		  //4- toUpperCase ==> Converts all characters to UpperCases and it returns String
		  
		  String str4 = "java";
		  System.out.println(str4.toUpperCase()); //JAVA
		
		  //5- toLowerCase ==> Converts all characters to UpperCases and it returns String
		  
		  String str5 = "jAvA";
		  System.out.println(str5.toLowerCase()); //java 
		  
		  //6- contains() ==>Checks if any specific characters exist or not and it returns boolean 
		  
		  System.out.println(str5.contains("v")); //true
		  
		  String str6 = "java is not boring";
		  
		  System.out.println(str6.contains(str5.toLowerCase()));
		 
		  //7- chartAt() ==> used to get a specific character from String and it returns character
		  
		  System.out.println(str6.charAt(25)); //StringIndexOutOfBoundsException==> If you use an index greater than the last index 
		  											//you will get that Exception
	
		  
		  /*
		   Ask user to enter a String.
		   Type code to return every time the last character of the String
		   */
		  
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter a String...");
		   String str7 = scanner.next().toLowerCase();
		   
		   
		   //length()-1 is used to get last index of a string
		   
		   System.out.println(str7.charAt(str7.length()-1));
		   
		   scanner.close();

	}
}

