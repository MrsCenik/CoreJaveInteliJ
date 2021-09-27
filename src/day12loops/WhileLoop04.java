package day12loops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
		 Write a program to count the factors of an integer which is entered by user/ 
		 
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		
		int i= 1;
		int count=0;
		
		while(i<=num) {
			if(num%i==0) {
				count++;
				
				System.out.print(i+"    ");
			}
			i++;
			
		}
		
		System.out.println();
		System.out.println("the number of positive factors "+ count);
		
		
		scanner.close();
	}

}
