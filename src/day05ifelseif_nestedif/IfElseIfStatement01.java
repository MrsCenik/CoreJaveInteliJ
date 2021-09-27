package day05ifelseif_nestedif;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		/*
		 Get a number from user,
		 if the number is less than zero, print "Negative"
		 if the number is greater than zero, print "Positive"
		 if the number equals to zero, print "Neutr"
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		if(num<0) {
			
			System.out.println("Negative");
		}else if(num>0){
			System.out.println("Positive");
		}else {
				
			
		}
		scan.close();
	}
}



