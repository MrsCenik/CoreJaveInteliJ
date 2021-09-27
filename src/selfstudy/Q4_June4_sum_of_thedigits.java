package selfstudy;

import java.util.Scanner;

public class Q4_June4_sum_of_thedigits {

	public static void main(String[] args) {
		//Get a 3-digit number integer from user and return the sum of its' digit
		//interview question
		/*
		 1.step: Get the last digit
		 	-123%10 =>3 put 3 in the lastDigit container
		 	-123/10=>12.3 Java will remove the part after dot you will get first two digit
		 2.step: 25%10=>5 put 5 in the midDigit container
		 		25/10=>2.5 Java will remove the part after dot you will get first digit
		 	
		 3.step: 2%10 => 2 put 2 in the firtsDigit container
		 
		 */
	
		int num = 0;
		int lastDigit = 0; 					//we created 4 containers for the number and its digits
		int midDigit = 0;
		int firstDigit = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3-Digit number...");    			//we are getting the number from user.
		num = scanner.nextInt();
		
		lastDigit= num%10;					//to find last digit we use modulus operator
		num = num/10;						
		
		midDigit= num%10;
		num= num/10;
		
		firstDigit= num%10;
		System.out.println(lastDigit+midDigit+firstDigit);
		
		
		
	scanner.close();	
		
	}

}
