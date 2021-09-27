package ReplitQuestions;
		/*
		 Write a program that accepts an integer as input and prints first 10 prime numbers greater than input 
		Check numbers if they are even or not in a return method.
		
		Input : 5
		
		Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */

import java.util.ArrayList;
import java.util.Scanner;

public class First10PrimeNumber {
	
	public static boolean primeNumber(int num) {
		
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scanner.nextInt();
		scanner.close();
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		
		while(primeList.size()<11) {
			
			if(!primeNumber(++input))
				primeList.add(input);
		}
		System.out.println(primeList);
		scanner.close();
	}
}