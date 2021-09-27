package day13loops;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her name
		 If the initial is lower case print a message like "Make the initial upper case"
		 It the initial is upper case print a message like "You did it right"
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		char initial= '*';
		do {
			
		System.out.println("Enter your First name please");	
		
		initial = scanner.next().charAt(0);
		 if (initial>='a' && initial <= 'z') {
			 System.err.println("Make the initial upper case");
			 
			 
			
			
		}
		
		
	}while(initial>='a' && initial <= 'z');
		System.out.println("Finally!!! You did it right :)");
		
		
		
		
	scanner.close();	
	}

}
