package practice_class04;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*
		  ask user to enter a integer number
             * find the sum of digitnumber
             * example 345=12
		 */
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter the a integer number");
		int number=scanner.nextInt();
		
		int a=0;
		int sum=0;      
		while(number>0) {
			
			a=number%10;
			sum=a+sum;
			
			number=number/10;
			
			
		}
		System.out.println("Sum of digit: "+sum);
		
				
		
		scanner.close();
	}

}
