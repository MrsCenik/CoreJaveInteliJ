package practice_class02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 	Ask user for a string and print a new string made of 3 copies of the last 2 letters
			The strings length will be at least 2.
			ORNEK:
   				INPUT      : Mustafa
   				OUTPUT     : fafafa
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s= scanner.next();
		
		String str= s.substring(s.length()-2);
		for(int i =1; i<4;i++) {
			System.out.print(str);
			
		}
		
		
		scanner.close();

	}

}
