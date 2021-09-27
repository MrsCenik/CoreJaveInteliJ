package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner12_Homework {

	public static void main(String[] args) {
		/*
			Type a program which asks user top enter his/her full name, and address then print them on the console like 
			the full name should be in the first line, and the address will be in the second line
			Hint: To get String, use nextLine()
			
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your full name..");
		
		String fullname = scanner.nextLine();
		System.out.println("Enter your address...");
		String address = scanner.nextLine();
		
		System.out.println(fullname);
		System.out.println(address);
		scanner.close();
	}

}
