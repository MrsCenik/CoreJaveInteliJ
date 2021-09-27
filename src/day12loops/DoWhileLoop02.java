package day12loops;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer.
		  If the integer is less than 100, tell user "Won!"
		  Otherwise tell user "Lost!"
		 */

		Scanner scanner=new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Enter a number to join the game");
			num=scanner.nextInt();
			
			if(num<100) {
				System.out.println("You won!!!");
			}
		}while(num<100);
			System.out.println("You LOST!!!");
		
		scanner.close();
		

	}

}
