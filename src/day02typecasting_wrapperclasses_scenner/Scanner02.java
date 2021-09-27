package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		//Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		//Give message to user
		System.out.println("hey user enter your name...");
		//Create a container to store data coming from user
		String firstname = scanner.nextLine();
		
		System.out.println("Hey user enter your last name...");
		String lastname = scanner.nextLine();
		
		
		System.out.println("Hey user enter your address...");
		String address = scanner.nextLine();
		
		
		System.out.println("You are retired, true or false...");
		boolean isRetired = scanner.nextBoolean();
		//Note: To get String data from user, you have naxtLine() and just next() methods. 
		//NextLine() methods takes all string, but next() takes just the first word.
		
		System.out.println("Hey user, enter your name...");
		String name = scanner.next();
		
		
		System.out.println(lastname);
		System.out.println(firstname);
		System.out.println(address);
		System.out.println(isRetired);
		System.out.println(name);
	scanner.close();
	}

}
