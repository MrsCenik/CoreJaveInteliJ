package day13loops;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer
		     If the integer is even print on the console "You won!"
			 Otherwise ask user to enter another integer
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num= 0;
		
		
		do{
			System.out.println("Enter an even Number");
			
			num = scanner.nextInt();
			
			
			
		}while(num%2!=0);
		System.out.println("You Won :)");
		
		 
	
	
	





scanner.close();
}
}
