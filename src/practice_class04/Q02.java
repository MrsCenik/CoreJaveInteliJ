package practice_class04;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a character and print the ASCII value of that character
		 */

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter any characer to learn ASCII value..");
			char ch= scanner.next().charAt(0);
			int asc=ch;
			
			System.out.println("ASCII value: " + asc);

			scanner.close();

	}
	

}
