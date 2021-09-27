package day05ifelseif_nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a integer
		 If the integer is less then 0 check if it is less than -9
		 If it is less than -9, print "Too small", otherwise print "small"
		 If the integer is greater then 0 check if it is greater than 9.
		 If it is greater than 9, print "Too big", otherwise print "big"
		 */
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter an integer");
		int n = scanner.nextInt();
		
		if(n<0) {
			if(n>-9){
				System.out.println("Small");
			}else {
				System.out.println("Too Small");
		}
			}else if(n>0) {
				if(n>9) {
					System.out.println("Too Big");
				}else {
					System.out.println("Big");
			}
				}else {
					
					System.out.println("Please enter positive or negative integer");
					
				}
		scanner.close();		
			}
			
		
		}		
