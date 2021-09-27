package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		/*
		 A school has following rules for grading system:
		 1. Below 50- D 2. 50 to 59 - C 3.60-79 B 4.From 80 to 100 -A
		 Ask user to enter marks and print the corresponding grade.
		 
		 */

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mark...");
		int m = scanner.nextInt();
	
		if (m<0) {
			System.out.println("Do not enter negative value...");	
		}else if(m<50) {
			System.out.println("D");
		}else if(m<60) {
			System.out.println("C");
		}else if(m<80){
			System.out.println("B");
		}else if(m<101) {
			System.out.println("A");					
		}else {
			System.out.println("Please enter 100 at most...");
			
			
			/*
			 We did not put m<0 and else at the end, 
			 we got some issue when user enter negative value and a number greater then 100. 
			 We fixed the problem by adding a if at the beginning and else at the end.
			 It is called "Boundary Value Analysis".  
			 */
			
		}
		scanner.close();
	}
}
