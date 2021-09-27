package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		/*
		 Get a number from user,
		 if the number less than zero, print "Negative"
		 if the number is greater than zero, print "positive"
		 if the number equals to zero, print "Neutr" 
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an intiger...");
		int num=scanner.nextInt();
		
		
		if(num<0) {
			System.out.println(num + " is Negative");
			
		}else if(num>0) {
			System.out.println(num + " is Positive");
			
		}else {
			System.out.println(num + " is Neutr");
			
		}
		scanner.close();
	}

}
