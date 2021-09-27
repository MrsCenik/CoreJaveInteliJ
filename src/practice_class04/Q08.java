package practice_class04;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		/*
		 *  ask to user how many cups of tea you drink daily and how many spoons of sugar
             * one spoon sugar is 1.7 gr
             * print on the console amount of sugar used annually
             *
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many cups of tea you drink daily");
		int tea= scanner.nextInt();
		System.out.println("How many spoons of sugar you use for one cup");
		int sugar=scanner.nextInt();
		
		int totalsugar= sugar*tea*365;
		double gr=totalsugar*1.7;
		
		System.out.println("You use " + gr + " gr sugar for a year" );
		
		
		
		scanner.close();
	}

}
