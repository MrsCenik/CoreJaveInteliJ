package day29exceptionsabstraction;

import java.util.Scanner;

public class 	E01 {

	public static void main(String[] args) {

		/*
		  ^throw keyword is used to throw an exception explicitly
		  ^Only single exception is thrown by using throw
		  ^throw keyword is used within the method
		  ^Syntax wise throw keyword is followed by the instance variable
		  
		  
		  ^^throws keyword is used to declare one or more exceptions, separate by commas
		  ^^Multiple exceptions can be thrown by using throws 
		  ^^throws keyword is used with the method signature
		  ^^Syntax wise throws keyword is followed by exception class names.
		  
		  
		 */
		
		// IllegalArgumentException
		//Sometimes  we do not want to use some values for some parameters.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age..");
		int age = scanner.nextInt();
		
		try{
			setAge(age);
		}catch(IllegalArgumentException e) {
			System.out.println("Do not use negative values for ages...");	
		}
		scanner.close();
	}
	public static void setAge(int age) throws IllegalArgumentException{
		if(age<0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println("Your age is "+ age);
		}	
	}
}