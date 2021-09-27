package day05ifelseif_nestedif;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter year
		 Type java code by using if-else if() statement.
		 Write a program to check if year is leap or not.
		 If the year is divisible by 100 then it must be divisible by 400.
		 If a year is not divisible by 100 then if must be divisible by 4.
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year to check if it is 'Leap year'  or not...");
		int year = scanner.nextInt();
		
	/*
	 Single & and double && have similar functionality.
	 If you use &, Java check all conditions every time.
	 If you use &&, Java does not check the second condition if the first condition is false. 
	 */
		
		if(year%100==0 && year%400==0) {
			System.out.println(year + " is leap year");
		}else if(year%100!=0 && year%4==0) {
			System.out.println(year + " is leap year");
		}else {
			System.out.println(year + " is notleap year");
			
		}
		scanner.close();
	}

}
