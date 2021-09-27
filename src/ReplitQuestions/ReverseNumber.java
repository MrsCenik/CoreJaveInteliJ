package ReplitQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		 Write a java program to reverse the number which user entered.

			Input  :1238  
			Output :Reverse Of The Number: 8321
		 */
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter an intiger");
		String input=scanner.next();
		int n = input.length();
		String reverse="";
		for(int i=n-1; i>=0; i--) {
			reverse+=input.charAt(i);	
		}
		System.out.println(reverse);
		scanner.close();
	}
}
