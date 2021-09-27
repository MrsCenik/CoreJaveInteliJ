package practice_class04;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
		 Write a program in Java to input 5 numbers from keyboard and find their sum and average.
	EXAMPLE:
       INPUT     : 
	Input the 5 numbers :                                                           
	1                                                                               
	2                                                                               
	3                                                                               
	4                                                                               
	5             
    OUTPUT :
	The sum of 5 no is : 15                                                         
	The Average is : 3.0
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=scanner.nextInt();
		System.out.println("Enter 2nd number");
		int b=scanner.nextInt();
		System.out.println("Enter 3rd number");
		int c=scanner.nextInt();
		System.out.println("Enter 4rd number");
		int d=scanner.nextInt();
		System.out.println("Enter 5th number");
		int e=scanner.nextInt();
		int sum = a+b+c+d+e;
		double ave=sum/5;
		
		
		System.out.println("The sum of 5 no is: " + sum);
		System.out.println("The Average is: "+ave);
		
		
	scanner.close();
	
	}

}
