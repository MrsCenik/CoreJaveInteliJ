package day03increment_decrement_operators;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		/*
		 Modulus Operator(%) is used to find remainder 
		 25/4 ==>reminder will be 1
		 
		 20/5 = 4
		 20%5 = 0
	
		 */
		
		System.out.println(21%5);//1
		
		
		// Get a number from user and print the last digit of that number
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number here: ");
//		int num = scanner.nextInt();
//		
//		int lastDigit = num %10;
//		
//		System.out.println("The last digit of the number is " + lastDigit);
//		
		//Get a 3-digit number integer from user and return the sum of its' digit
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a 3-digit number");
		
		int number = scanner.nextInt();
		
		int lastDigit = 0;
		int midDigit = 0;
		int firstDigit = 0;
		int middle = 0;
		
		
		lastDigit = number%10;
		firstDigit = number/100;
		middle = number/10;
		midDigit = middle%10;
		
				
		
		System.out.println(firstDigit+midDigit+lastDigit);
		
		scanner.close();	
		
	}
	

}
