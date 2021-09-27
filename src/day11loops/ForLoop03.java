package day11loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 
		 */
		
		for(int i = 1; i<4; i++) {
			
			
			for(int j = 5; j<7; j++) {
				
				
				
				System.out.println(i +"===="+j);
		}
			
			
		}
		
		/*
		Ask user to enter the number of rows and the number columns then draw rectangle by using *		
			 
			 		Example: row = 3, column=4		 	     
			 		    * * * *		 	        
			 		    * * * * 		 	      
			 		    * * * *  
		 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the # or rows");
		int row = scanner.nextInt();
		
		System.out.println("Enter the # or columns");
		
		int col = scanner.nextInt();
		
		for(int i = 1; i<=row; i++) {
			
			for(int j = 0; j<=col; j++) {
				
			System.out.print("* ");
			
				
				
				
			}
			System.out.println();
		}
		
		scanner.close();
		
		
	}

}
