package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
		/*
		 	If it is rain, I will cancel the picnic.
		 			true			true
		 			false			false
		 			
		 */
		
		// Get an intiger from user then tell IF the number is even or odd
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//
//		int num = scan.nextInt();
//	// we must double equal sign because we are not assigning just desire equality. 
//		if(num % 2 == 0) {
//			System.out.println("the number is even");	
//			
//		}
//		if(num % 2 != 0) {
//			
//			System.out.println("the number is odd");
//		}
//		
//		
//		//Get a number from user then check if the number is negative or positive 
//		System.out.println("Enter another number");
//
//		int num1 = scan.nextInt();
//		
//		if(num1 > 0) {
//			System.out.println("the number is + ");
//
//			
//		}
//		
//		if (num1 < 0) {
//			System.out.println("the number is -");
//		}
//
//		//Get the length and the height of a rectangle from user, if they equal to each other		
//		//print "Square" on the console, otherwise print "Rectangle" on the console.
		System.out.println("Enter a side of the rectangle");
		
		double side1 = scan.nextDouble();
		
		System.out.println("enter another side of the rectangle");
		double side2 = scan.nextDouble();
		if (side1<0 || side2 <0) {
			System.err.println("For Sides use positive values..."); //"err" is for error messages. 
			
		}
		if (side1 == side2) {
			System.out.println("square");
		}
		
		if (side1 != side2) {	
			System.out.println("rectangle");
		
		
		}
		scan.close();
			
		}
		
	}

