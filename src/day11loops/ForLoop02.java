package day11loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 
		Type code to find the multiplication of the numbers from 1 to 10
		 */
		
		
		int product = 1;
		
		for(int i=1; i<=10 ; i++) {
			
			product = product*i;	
			
		}
		
		System.out.println("The product of 1 to 10 is "+ product);

		
		/*
		 Ask user to enter a number to find its factorial.
		 */
		// after 17! we can not valid results because of data type
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		int a =1;
		if(num<0) {
			
			System.err.println("Invalid valeu for factorial...");
		}else {
			
	
			for(int i = num; i>0; i--) {
				
				a = a*i;
			}
			
			System.out.println( num+ "!  =" + a);
		
		
		
		
		scanner.close();
		
	}
	}
}
