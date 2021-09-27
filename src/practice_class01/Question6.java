package practice_class01;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*
	       * Type java code by using if-else statement,
	       * Write a program to print absolute value of a number entered by user.
	       */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		
		if(num>0) {
			System.out.println(num);
		}else {
			System.out.println(num*-1+" is absolute");
		
			
		}
		
		scanner.close();
		}

}
