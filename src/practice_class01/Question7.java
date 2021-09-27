package practice_class01;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*
	     * A company decided to give bonus of 5% to employee if his/her year of service is more than or equal 5 years.
	     * Ask user for their salary and year of service and print the net bonus amount.
	     * Example: Input= 4 year service
	     *               salary: 4000
	     *          Output= 0
	     */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your salary");
		int salary= scanner.nextInt();
		
		System.out.println("How long have you been working");
		int year= scanner.nextInt();
		if(year>=5) {
		System.out.println("your bonus is "+ salary *5/100+"$");	
		
		
		}else {
			System.out.println("You need to work "+ (5-year)+ " years more to get bnonus");
			
			
		}
		
		
scanner.close();
	}

}
