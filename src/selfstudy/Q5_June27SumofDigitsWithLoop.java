package selfstudy;

import java.util.Scanner;

public class Q5_June27SumofDigitsWithLoop {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
	         Write a program that prompts the user to input an integer.
	         It should then find sum of the digits of that number.
	         	123 ==> 1+2+3 = 6
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number to find the sum of its digits");
		
		int num=scanner.nextInt();
		
	
		int sum=0;
		
		
		do {
			sum=sum+num%10;
			num=num/10;
			
			
		}
		while(num!=0); 
		System.out.println(Math.abs (sum));
			
		
		scanner.close();
}
}
