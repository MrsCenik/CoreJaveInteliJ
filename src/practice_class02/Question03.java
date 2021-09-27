package practice_class02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*Write a program to print a number entered by user,
		  which are not divisible by 5 or divisible by 5
		 */
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num =scanner.nextInt();
		 
		 if(num%5==0) {
			 System.out.println("The number is divisible by 5 =" +num);
			 
		 }else {
			 System.out.println("The number is not divisible by5 ="+num);
		 }		 
		 scanner.close();	
	}
	
}
