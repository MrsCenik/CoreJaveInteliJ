package day05ifelseif_nestedif;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		Ask user to enter a 4 digit integer, then print the sum of the first and last digit of the number on console.
		For example; if user 1234 you will add 1 and 4, then print on the console 5
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a 4 digit number...");
		int num = scanner.nextInt();
		
		num= Math.abs(num); //if user enter -(negative) number, this math class will turn it positive.(math: class, abs:method)
		
		
		if (num>999 && num<10000) {
			int ld=num%10;
			int fd=num/1000;
			System.out.println("The sum is " +(ld+fd));
		}else {
			System.out.println("I told you to enter 4 digit number...");				
		}
		scanner.close(); // you should close the scanner otherwise everyone can read your scanner. 
	}

}  
