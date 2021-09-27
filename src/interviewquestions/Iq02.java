package interviewquestions;

import java.util.Scanner;

public class Iq02 {
	
	//Ask user the number of the fibonacci numbers than print fibonacci numbers on the console
	//User --> 7 ==> 1 1 2 3 5 8 13
	/*
	 Logic:  F1 and F2 in the first loop then F1+F2 will be new F2 and F2 will be the new F1 in the second loop
	 */
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Eneter a number");
	int num = scan.nextInt();
	
	printFibonacci(num);
	scan.close();
	}
	
	public static void printFibonacci(int num) {
		int f1 = 1;
		int f2= 1;
		int newF2 = 0;
		System.out.print(f1+" "+ f2+ " ");
		
		for(int i = 1; i<num-2; i++) {
		
		newF2 = f1+f2;
		f1 = f2;
		f2 =newF2;
		System.out.print(newF2+ " ");
		}
		
	}

}
