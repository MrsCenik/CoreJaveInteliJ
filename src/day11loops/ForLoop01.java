package day11loops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 Type a program to find the sum of the integers from 1 top 100
		 
		 */
		int sum = 0;
		
		for(int i=0; i<=100 ; i++) {
			
			sum = sum+i;	
			
		}
		
		System.out.println("The sum of the integers from 1 to 100 is "+sum);
		
	
	
	/*
	 Ask user to enter starting and ending value, 
	 then find the sum of all integers from the starting to the ending value
	 */
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enetr a start value");
	int x = scanner.nextInt();
	System.out.println("Eneter an End Value");
	int y = scanner.nextInt();
	
	if(x>y) {
		System.out.println("Invalid start value...");
	}else {
		
	
	
	int sum1= 0;
	
	for(int i = x; i<=y; i++) {
		
		sum1= sum1+i;
	
		
	}
		
	
	System.out.println("The sum is "+ sum1);
	
	scanner.close();
	
	
	}	
	}

}
