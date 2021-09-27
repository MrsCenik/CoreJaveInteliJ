package day13loops;

import java.util.Scanner;

public class DoWhileLoop04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter password
		 If the password has more than 6 characters print "Password is valid..."
		 Otherwise,  print "Make the password longer than 6 characters" and ask user enter a new password
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String passw = "";
		do {
			System.out.println("Enter a password");
			
			passw= scanner.nextLine();
			
			if (passw.length()<=6) {
				System.err.println("This is not what I want.. Invalid password.. make it more than 6 characters");
			}
				
		}while (passw.length()<=6);
		
		System.out.println("VALID password");
			
		
		
		
		
		
		
		scanner.close();
	}

}
