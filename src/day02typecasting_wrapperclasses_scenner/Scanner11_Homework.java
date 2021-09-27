package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner11_Homework {

	public static void main(String[] args) {
		/*
		 
		 Type a program which asks user to enter his/her name and last name, then print it on the console
		 Hint: To get String, use nextLine()
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name and last name...");
		
		String firstnameandlastname = scanner.nextLine();
		
		System.out.println(firstnameandlastname);
		
		scanner.close();	
			
	}

}
